package net.mcreator.analcraft.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Enchantments;

import net.mcreator.analcraft.ElementsAnalcraftMod;

import java.util.Map;

@ElementsAnalcraftMod.ModElement.Tag
public class ProcedureKnockbackfistRightClickedOnBlock extends ElementsAnalcraftMod.ModElement {
	public ProcedureKnockbackfistRightClickedOnBlock(ElementsAnalcraftMod instance) {
		super(instance, 69);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure KnockbackfistRightClickedOnBlock!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).addEnchantment(Enchantments.KNOCKBACK, (int) 10);
	}
}
