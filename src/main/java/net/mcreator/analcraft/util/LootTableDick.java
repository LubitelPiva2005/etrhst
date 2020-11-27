
package net.mcreator.analcraft.util;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.util.ResourceLocation;

import net.mcreator.analcraft.ElementsAnalcraftMod;

@ElementsAnalcraftMod.ModElement.Tag
public class LootTableDick extends ElementsAnalcraftMod.ModElement {
	public LootTableDick(ElementsAnalcraftMod instance) {
		super(instance, 18);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		LootTableList.register(new ResourceLocation("minecraft", "chests/dick"));
	}
}
