
package net.mcreator.analcraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.analcraft.item.ItemAncientseemeningot;
import net.mcreator.analcraft.block.BlockAncientseemen;
import net.mcreator.analcraft.ElementsAnalcraftMod;

@ElementsAnalcraftMod.ModElement.Tag
public class RecipeAncientseemenreciepe extends ElementsAnalcraftMod.ModElement {
	public RecipeAncientseemenreciepe(ElementsAnalcraftMod instance) {
		super(instance, 74);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockAncientseemen.block, (int) (1)), new ItemStack(ItemAncientseemeningot.block, (int) (1)), 1F);
	}
}
