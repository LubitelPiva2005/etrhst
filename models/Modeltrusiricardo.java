
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