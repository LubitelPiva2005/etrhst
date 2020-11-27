
package net.mcreator.analcraft.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.analcraft.item.ItemGachi;
import net.mcreator.analcraft.ElementsAnalcraftMod;

@ElementsAnalcraftMod.ModElement.Tag
public class TabAnaltab extends ElementsAnalcraftMod.ModElement {
	public TabAnaltab(ElementsAnalcraftMod instance) {
		super(instance, 49);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabanaltab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemGachi.helmet, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
