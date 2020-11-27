package net.mcreator.analcraft.procedure;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Enchantments;

import net.mcreator.analcraft.ElementsAnalcraftMod;

import java.util.Map;

@ElementsAnalcraftMod.ModElement.Tag
public class ProcedureKnockbackfistRightClickedInAir extends ElementsAnalcraftMod.ModElement {
	public ProcedureKnockbackfistRightClickedInAir(ElementsAnalcraftMod instance) {
		super(instance, 68);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			System.err.println("Failed to load dependency itemstack for procedure KnockbackfistRightClickedInAir!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		((itemstack)).addEnchantment(Enchantments.KNOCKBACK, (int) 10);
	}
}
