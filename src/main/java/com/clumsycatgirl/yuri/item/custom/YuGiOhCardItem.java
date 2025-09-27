package com.clumsycatgirl.yuri.item.custom;

import com.clumsycatgirl.yuri.YuriMod;
import com.clumsycatgirl.yuri.component.ModDataComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class YuGiOhCardItem extends Item {
	private final String cardName;

	public YuGiOhCardItem(final String cardName, final Properties properties) {
		super(properties);
		this.cardName = cardName;
	}

	@Override
	public void appendHoverText(@NotNull ItemStack stack, @NotNull TooltipContext context, @NotNull List<Component> tooltipComponents, @NotNull TooltipFlag tooltipFlag) {
		tooltipComponents.add(Component.translatable("tooltip." + YuriMod.MOD_ID + "." + this.cardName + ".tooltip"));
		super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand usedHand) {
		ItemStack item = player.getMainHandItem();
		item.set(ModDataComponent.SHOWN, Boolean.FALSE.equals(item.get(ModDataComponent.SHOWN)));
		return super.use(level, player, usedHand);
	}
}
