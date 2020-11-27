
package net.mcreator.analcraft.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBase;

import net.mcreator.analcraft.procedure.ProcedureTrusiLeggingsTickEvent;
import net.mcreator.analcraft.creativetab.TabAnaltab;
import net.mcreator.analcraft.ElementsAnalcraftMod;

import java.util.Map;
import java.util.HashMap;

@ElementsAnalcraftMod.ModElement.Tag
public class ItemTrusi extends ElementsAnalcraftMod.ModElement {
	@GameRegistry.ObjectHolder("analcraft:trusihelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("analcraft:trusibody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("analcraft:trusilegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("analcraft:trusiboots")
	public static final Item boots = null;
	public ItemTrusi(ElementsAnalcraftMod instance) {
		super(instance, 35);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("TRUSI", "analcraft:trusi", 25, new int[]{2, 7, 6, 2}, 50,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 2f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS) {
			@Override
			@SideOnly(Side.CLIENT)
			public ModelBiped getArmorModel(EntityLivingBase living, ItemStack stack, EntityEquipmentSlot slot, ModelBiped defaultModel) {
				ModelBiped armorModel = new ModelBiped();
				armorModel.bipedLeftLeg = new Modeltrusiricardo().lefthand;
				armorModel.bipedRightLeg = new Modeltrusiricardo().righthand;
				armorModel.isSneak = living.isSneaking();
				armorModel.isRiding = living.isRiding();
				armorModel.isChild = living.isChild();
				return armorModel;
			}

			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
				return "analcraft:textures/dsfsd.png";
			}

			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();
					$_dependencies.put("entity", entity);
					ProcedureTrusiLeggingsTickEvent.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("trusilegs").setRegistryName("trusilegs").setCreativeTab(TabAnaltab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("analcraft:trusilegs", "inventory"));
	}
	public static class Modeltrusiricardo extends ModelBase {
		private final ModelRenderer lefthand;
		private final ModelRenderer righthand;
		public Modeltrusiricardo() {
			textureWidth = 64;
			textureHeight = 64;
			lefthand = new ModelRenderer(this);
			lefthand.setRotationPoint(0.0F, 0.0F, 0.0F);
			lefthand.cubeList.add(new ModelBox(lefthand, 18, 41, 0.0F, -1.0F, -3.0F, 5, 10, 6, 0.0F, false));
			righthand = new ModelRenderer(this);
			righthand.setRotationPoint(0.0F, 0.0F, 0.0F);
			righthand.cubeList.add(new ModelBox(righthand, 35, 24, -5.0F, -1.0F, -3.0F, 5, 10, 6, 0.0F, false));
		}

		@Override
		public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
			lefthand.render(f5);
			righthand.render(f5);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
			super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		}
	}
}
