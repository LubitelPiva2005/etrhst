package net.mcreator.analcraft.procedure;

import net.minecraft.potion.PotionEffect;
import net.minecraft.init.MobEffects;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

import net.mcreator.analcraft.ElementsAnalcraftMod;

import java.util.Map;

@ElementsAnalcraftMod.ModElement.Tag
public class ProcedureRicardoEntityIsHurt extends ElementsAnalcraftMod.ModElement {
	public ProcedureRicardoEntityIsHurt(ElementsAnalcraftMod instance) {
		super(instance, 32);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure RicardoEntityIsHurt!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.BLINDNESS, (int) 2, (int) 1));
	}
}
