
package net.mcreator.analcraft.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.analcraft.creativetab.TabAnaltab;
import net.mcreator.analcraft.ElementsAnalcraftMod;

@ElementsAnalcraftMod.ModElement.Tag
public class ItemBriemienskiieMuzykanty extends ElementsAnalcraftMod.ModElement {
	@GameRegistry.ObjectHolder("analcraft:briemienskiiemuzykanty")
	public static final Item block = null;
	public ItemBriemienskiieMuzykanty(ElementsAnalcraftMod instance) {
		super(instance, 55);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("analcraft:briemienskiiemuzykanty", "inventory"));
	}
	public static class MusicDiscItemCustom extends ItemRecord {
		public MusicDiscItemCustom() {
			super("briemienskiiemuzykanty", ElementsAnalcraftMod.sounds.get(new ResourceLocation("analcraft:bremenskiemuzykanty")));
			setUnlocalizedName("briemienskiiemuzykanty");
			setRegistryName("briemienskiiemuzykanty");
			setCreativeTab(TabAnaltab.tab);
		}
	}
}
