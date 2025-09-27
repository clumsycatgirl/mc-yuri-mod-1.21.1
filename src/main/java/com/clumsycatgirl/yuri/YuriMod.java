package com.clumsycatgirl.yuri;

import com.clumsycatgirl.yuri.block.ModBlocks;
import com.clumsycatgirl.yuri.component.ModDataComponent;
import com.clumsycatgirl.yuri.item.ModCreativeModeTabs;
import com.clumsycatgirl.yuri.item.ModItems;
import com.clumsycatgirl.yuri.item.YgoItems;
import com.clumsycatgirl.yuri.sound.ModSounds;
import com.clumsycatgirl.yuri.util.ModItemProperties;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(YuriMod.MOD_ID)
public class YuriMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "clumsycatgirl_yuri";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public YuriMod(final IEventBus modEventBus, final ModContainer modContainer) {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.
        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

		ModCreativeModeTabs.register(modEventBus);

		YgoItems.register(modEventBus);

		ModItems.register(modEventBus);
		ModBlocks.register(modEventBus);
		ModSounds.register(modEventBus);

		ModDataComponent.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(final BuildCreativeModeTabContentsEvent event) {
		if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
			event.accept(ModItems.GAY);
		} else if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			event.accept(ModItems.LESBIAN_DISC);
		} else if (event.getTabKey() == CreativeModeTabs.FUNCTIONAL_BLOCKS) {
			event.accept(ModBlocks.COMPANION_BLOCK);
		}
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

	// You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
	@EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientModEvents {
		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {
			ModItemProperties.addCustomItemProperties();
		}
	}
}
