
public static class Modeltru extends EntityModel<Entity> {
	private final ModelRenderer lefthand;
	private final ModelRenderer righthand;

	public Modeltru() {
		textureWidth = 64;
		textureHeight = 64;

		lefthand = new ModelRenderer(this);
		lefthand.setRotationPoint(0.0F, 0.0F, 0.0F);
		lefthand.setTextureOffset(18, 41).addBox(0.0F, -9.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);

		righthand = new ModelRenderer(this);
		righthand.setRotationPoint(0.0F, 0.0F, 0.0F);
		righthand.setTextureOffset(36, 42).addBox(-4.0F, -9.0F, -2.0F, 4.0F, 10.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		lefthand.render(matrixStack, buffer, packedLight, packedOverlay);
		righthand.render(matrixStack, buffer, packedLight, packedOverlay);
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