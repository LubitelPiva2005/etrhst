
package net.mcreator.analcraft.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import net.mcreator.analcraft.creativetab.TabAnaltab;
import net.mcreator.analcraft.ElementsAnalcraftMod;

@ElementsAnalcraftMod.ModElement.Tag
public class BlockCumblock extends ElementsAnalcraftMod.ModElement {
	@GameRegistry.ObjectHolder("analcraft:cumblock")
	public static final Block block = null;
	public BlockCumblock(ElementsAnalcraftMod instance) {
		super(instance, 85);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("cumblock"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("analcraft:cumblock", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.SPONGE);
			setUnlocalizedName("cumblock");
			setSoundType(SoundType.SLIME);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabAnaltab.tab);
		}
	}
}
