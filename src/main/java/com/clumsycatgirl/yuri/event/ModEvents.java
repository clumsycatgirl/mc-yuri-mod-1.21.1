package com.clumsycatgirl.yuri.event;

import com.clumsycatgirl.yuri.YuriMod;
import com.clumsycatgirl.yuri.item.custom.RandomPickerItem;
import com.mojang.logging.LogUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import org.slf4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

@EventBusSubscriber(modid = YuriMod.MOD_ID, bus = EventBusSubscriber.Bus.GAME, value = Dist.CLIENT)
public class ModEvents {
	private static final Logger LOGGER = LogUtils.getLogger();

	@SubscribeEvent
	public static void onRandomPickerUse(PlayerInteractEvent.RightClickBlock event) {
		try {
			final ItemStack stack = event.getItemStack();
			final Level level = event.getLevel();

			if (!(stack.getItem() instanceof RandomPickerItem)) {
				return;
			}

			final BlockPos blockPosition = event.getHitVec().getBlockPos();
			final BlockEntity blockEntity = level.getBlockEntity(blockPosition);

			if (!(blockEntity instanceof Container container)) {
				return;
			}

			final int itemsCount = container.getContainerSize();
			final List<ItemStack> items = new ArrayList<>();
			final List<Integer> itemCounts = new ArrayList<>();

			AtomicReference<ItemStack> item = new AtomicReference<>();
			IntStream.range(0, itemsCount).forEach(i -> {
				item.set(container.getItem(i));

				LOGGER.info("{} of {}", item.get().getCount(), item.get().getDescriptionId());

				IntStream.range(0, item.get().getCount()).forEach(j -> items.add(item.get().copy()));
				IntStream.range(0, item.get().getCount()).forEach(j -> itemCounts.add(i));
			});

			final int drawIndex = level.random.nextInt(0, items.size());
			final ItemStack drawItem = items.get(drawIndex);
			final int containerSlotIndex = itemCounts.get(drawIndex);

			container.removeItem(containerSlotIndex, 1);

			Player player = event.getEntity();

			drawItem.setCount(1);
			if (!player.getInventory().add(drawItem)) {
				player.drop(drawItem, false);
			}

			event.setCanceled(true);
		} catch (Exception e) {
			LOGGER.error("Error handling RandomPicker usage: ", e);
		}
	}
}
