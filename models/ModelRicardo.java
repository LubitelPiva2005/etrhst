
public static class ModelRicardo extends ModelBase {
	private final ModelRenderer body;
	private final ModelRenderer leftleg;
	private final ModelRenderer rightleg;
	private final ModelRenderer rightarm;
	private final ModelRenderer leftarm;
	private final ModelRenderer head;

	public ModelRicardo() {
		textureWidth = 64;
		textureHeight = 64;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 10.0F, -1.0F);
		body.cubeList.add(new ModelBox(body, 18, 6, -3.0F, 0.0F, -1.0F, 6, 4, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 4, 18, -1.0F, 4.0F, -2.0F, 2, 3, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 37, 3, -4.0F, -5.0F, -2.0F, 8, 5, 5, 0.0F, false));

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.0F, 14.0F, 0.0F);
		leftleg.cubeList.add(new ModelBox(leftleg, 20, 17, -1.0F, 0.0F, -2.0F, 3, 5, 3, 0.0F, false));
		leftleg.cubeList.add(new ModelBox(leftleg, 31, 15, -1.0F, 9.0F, -3.0F, 2, 1, 3, 0.0F, false));
		leftleg.cubeList.add(new ModelBox(leftleg, 3, 6, -1.0F, 5.0F, -1.0F, 2, 5, 2, 0.0F, false));

		rightleg = new ModelRenderer(this);
		rightleg.setRotationPoint(-2.0F, 14.0F, 0.0F);
		rightleg.cubeList.add(new ModelBox(rightleg, 35, 21, -2.0F, 0.0F, -2.0F, 3, 5, 3, 0.0F, false));
		rightleg.cubeList.add(new ModelBox(rightleg, 46, 15, -1.0F, 5.0F, -1.0F, 2, 5, 2, 0.0F, false));
		rightleg.cubeList.add(new ModelBox(rightleg, 49, 24, -1.0F, 9.0F, -3.0F, 2, 1, 3, 0.0F, false));

		rightarm = new ModelRenderer(this);
		rightarm.setRotationPoint(-4.0F, 6.0F, -1.0F);
		rightarm.cubeList.add(new ModelBox(rightarm, 3, 33, -3.0F, -1.0F, -1.0F, 3, 5, 3, 0.0F, false));
		rightarm.cubeList.add(new ModelBox(rightarm, 20, 34, -2.0F, 4.0F, 0.0F, 2, 6, 2, 0.0F, false));

		leftarm = new ModelRenderer(this);
		leftarm.setRotationPoint(4.0F, 6.0F, -1.0F);
		leftarm.cubeList.add(new ModelBox(leftarm, 33, 34, 0.0F, -1.0F, -1.0F, 3, 5, 3, 0.0F, false));
		leftarm.cubeList.add(new ModelBox(leftarm, 48, 35, 0.0F, 4.0F, 0.0F, 2, 6, 2, 0.0F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 5.0F, -1.0F);
		head.cubeList.add(new ModelBox(head, 3, 47, -3.0F, -6.0F, -3.0F, 6, 6, 5, 0.0F, false));
		head.cubeList.add(new ModelBox(head, 34, 53, -1.0F, -5.0F, 2.0F, 2, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
		leftleg.render(f5);
		rightleg.render(f5);
		rightarm.render(f5);
		leftarm.render(f5);
		head.render(f5);
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
		this.rightleg.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float) Math.PI) * f1;
		this.leftleg.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * f1;
	}
}