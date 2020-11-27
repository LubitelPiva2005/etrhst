
package net.mcreator.analcraft.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.analcraft.item.ItemYuutltghie;
import net.mcreator.analcraft.item.ItemSpermesword;
import net.mcreator.analcraft.ElementsAnalcraftMod;

@ElementsAnalcraftMod.ModElement.Tag
public class RecipeSpermesw extends ElementsAnalcraftMod.ModElement {
	public RecipeSpermesw(ElementsAnalcraftMod instance) {
		super(instance, 14);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemYuutltghie.block, (int) (1)), new ItemStack(ItemSpermesword.block, (int) (1)), 1F);
	}
}
