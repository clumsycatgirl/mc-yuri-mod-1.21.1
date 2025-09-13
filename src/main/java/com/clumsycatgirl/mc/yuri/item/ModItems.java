package com.clumsycatgirl.mc.yuri.item;

import com.clumsycatgirl.mc.yuri.YuriMod;
import com.clumsycatgirl.mc.yuri.sound.ModSounds;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.NotNull;

public class ModItems {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(YuriMod.MOD_ID);
	public static final DeferredItem<Item> GAY = ITEMS.register("gay", () -> {
		return new Item(new Item.Properties());
	});

	public static final DeferredItem<Item> LESBIAN_DISC = ITEMS.register("lesbian_disc", () -> {
		return new Item(new Item.Properties()
			.jukeboxPlayable(ModSounds.LESBIAN_SONG_KEY)
			.stacksTo(1));
	});

	public static void register(@NotNull final IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
