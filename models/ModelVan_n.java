
public static class ModelVan_n extends EntityModel<Entity> {
	private final ModelRenderer head;
	private final ModelRenderer body;
	private final ModelRenderer rleg2;
	private final ModelRenderer lleg;
	private final ModelRenderer rrarm;
	private final ModelRenderer llarm;

	public ModelVan_n() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -3.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -5.0F, -4.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 24.0F, 0.0F);
		body.setTextureOffset(16, 16).addBox(-4.0F, -24.0F, -2.0F, 8.0F, 12.0F, 4.0F, 0.0F, false);

		rleg2 = new ModelRenderer(this);
		rleg2.setRotationPoint(-2.0F, 12.0F, 0.0F);
		rleg2.setTextureOffset(0, 16).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		lleg = new ModelRenderer(this);
		lleg.setRotationPoint(2.0F, 12.0F, 0.0F);
		lleg.setTextureOffset(16, 48).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		rrarm = new ModelRenderer(this);
		rrarm.setRotationPoint(-4.0F, 1.0F, 0.0F);
		rrarm.setTextureOffset(32, 48).addBox(-4.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);

		llarm = new ModelRenderer(this);
		llarm.setRotationPoint(4.0F, 1.0F, 0.0F);
		llarm.setTextureOffset(40, 16).addBox(0.0F, -1.0F, -2.0F, 4.0F, 12.0F, 4.0F, 0.0F, false);
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		rleg2.render(matrixStack, buffer, packedLight, packedOverlay);
		lleg.render(matrixStack, buffer, packedLight, packedOverlay);
		rrarm.render(matrixStack, buffer, packedLight, packedOverlay);
		llarm.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.head.rotateAngleY = f3 / (180F / (float) Math.PI);
		this.head.rotateAngleX = f4 / (180F / (float) Math.PI);
		this.lleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.rrarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.llarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
		this.rleg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
	}
}