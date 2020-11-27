
package net.mcreator.analcraft.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import net.mcreator.analcraft.creativetab.TabAnaltab;
import net.mcreator.analcraft.ElementsAnalcraftMod;

import java.util.Set;
import java.util.HashMap;

@ElementsAnalcraftMod.ModElement.Tag
public class ItemAnsientseemenpickaxe extends ElementsAnalcraftMod.ModElement {
	@GameRegistry.ObjectHolder("analcraft:ansientseemenpickaxe")
	public static final Item block = null;
	public ItemAnsientseemenpickaxe(ElementsAnalcraftMod instance) {
		super(instance, 78);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("ANSIENTSEEMENPICKAXE", 4, 0, 22f, 0.5f, 15)) {
			{
				this.attackSpeed = -3f;
			}
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 4);
				return ret.keySet();
			}
		}.setUnlocalizedName("ansientseemenpickaxe").setRegistryName("ansientseemenpickaxe").setCreativeTab(TabAnaltab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("analcraft:ansientseemenpickaxe", "inventory"));
	}
}
