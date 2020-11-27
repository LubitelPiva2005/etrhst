package net.mcreator.analcraft.procedure;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.analcraft.gui.GuiTorgovecc;
import net.mcreator.analcraft.ElementsAnalcraftMod;
import net.mcreator.analcraft.AnalcraftMod;

import java.util.Map;

@ElementsAnalcraftMod.ModElement.Tag
public class ProcedureTorgovecRightClickedOnEntity extends ElementsAnalcraftMod.ModElement {
	public ProcedureTorgovecRightClickedOnEntity(ElementsAnalcraftMod instance) {
		super(instance, 45);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TorgovecRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure TorgovecRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure TorgovecRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure TorgovecRightClickedOnEntity!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure TorgovecRightClickedOnEntity!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).openGui(AnalcraftMod.instance, GuiTorgovecc.GUIID, world, x, y, z);
	}
}
