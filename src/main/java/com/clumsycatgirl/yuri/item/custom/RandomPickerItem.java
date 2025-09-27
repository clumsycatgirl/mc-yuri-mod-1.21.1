package com.clumsycatgirl.yuri.item.custom;

import com.clumsycatgirl.yuri.component.ModDataComponent;
import com.mojang.logging.LogUtils;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import org.slf4j.Logger;

public class RandomPickerItem extends Item  {
	public static final Logger LOGGER = LogUtils.getLogger();

	public RandomPickerItem(Properties properties) {
		super(properties);
	}
}
