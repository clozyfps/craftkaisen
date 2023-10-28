// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelhanami<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hanami"), "main");
	private final ModelPart Head;
	private final ModelPart ArmHold;
	private final ModelPart RightArm;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart Body;

	public Modelhanami(ModelPart root) {
		this.Head = root.getChild("Head");
		this.ArmHold = root.getChild("ArmHold");
		this.RightArm = root.getChild("RightArm");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(49, 9)
				.addBox(-5.361F, -63.3452F, -3.081F, 10.0F, 5.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 38)
				.addBox(1.309F, -69.4039F, -10.5463F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(104, 100)
				.addBox(2.043F, -70.9309F, -10.2803F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
				.addBox(-3.761F, -69.4039F, -10.5463F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(81, 90)
				.addBox(-3.027F, -70.9309F, -10.2803F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head_r1 = Head.addOrReplaceChild("head_r1",
				CubeListBuilder.create().texOffs(84, 0)
						.addBox(-1.977F, -0.863F, -2.5097F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 67)
						.addBox(-2.967F, -0.863F, -0.9897F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -61.291F, -4.028F, 0.6545F, 0.0F, 0.0F));

		PartDefinition Horn_r1 = Head.addOrReplaceChild("Horn_r1",
				CubeListBuilder.create().texOffs(4, 43)
						.addBox(-0.085F, -1.717F, -0.0013F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(94, 0)
						.addBox(4.985F, -1.717F, -0.0013F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.809F, -71.475F, -9.614F, -0.3927F, 0.0F, 0.0F));

		PartDefinition Horn_r2 = Head.addOrReplaceChild("Horn_r2",
				CubeListBuilder.create().texOffs(78, 15).addBox(-1.1751F, -2.4223F, -0.6081F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.144F, -70.677F, -9.215F, -0.0816F, -0.1253F, 0.7613F));

		PartDefinition Horn_r3 = Head.addOrReplaceChild("Horn_r3",
				CubeListBuilder.create().texOffs(82, 15).addBox(-0.6008F, -0.6368F, 0.6637F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.144F, -71.475F, -11.21F, 0.3655F, -0.147F, 0.3655F));

		PartDefinition Horn_r4 = Head.addOrReplaceChild("Horn_r4", CubeListBuilder.create().texOffs(84, 3)
				.addBox(-0.3348F, -0.6368F, 0.7967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 100)
				.addBox(4.7352F, -0.6368F, 0.7967F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.208F, -71.475F, -11.21F, 0.3927F, 0.0F, 0.0F));

		PartDefinition Horn_r5 = Head.addOrReplaceChild("Horn_r5",
				CubeListBuilder.create().texOffs(53, 86).addBox(-1.282F, -1.584F, -0.5333F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.809F, -71.475F, -9.614F, 0.0F, 0.0F, -0.7854F));

		PartDefinition Horn_r6 = Head.addOrReplaceChild("Horn_r6",
				CubeListBuilder.create().texOffs(88, 3).addBox(-0.75F, -2.116F, -0.1343F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.809F, -71.475F, -9.614F, 0.0F, 0.0F, -0.3927F));

		PartDefinition Horn_r7 = Head.addOrReplaceChild("Horn_r7", CubeListBuilder.create().texOffs(0, 23)
				.addBox(-1.218F, -2.4882F, -0.9323F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(95, 52)
				.addBox(3.852F, -2.4882F, -0.9323F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.543F, -65.091F, -7.752F, 0.7854F, 0.0F, 0.0F));

		PartDefinition Horn_r8 = Head.addOrReplaceChild("Horn_r8",
				CubeListBuilder.create().texOffs(52, 55)
						.addBox(-1.218F, -1.4242F, -0.5333F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 96)
						.addBox(3.852F, -1.4242F, -0.5333F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.543F, -65.091F, -7.752F, 1.1781F, 0.0F, 0.0F));

		PartDefinition Horn_r9 = Head.addOrReplaceChild("Horn_r9",
				CubeListBuilder.create().texOffs(52, 67)
						.addBox(4.501F, -1.6902F, -2.1293F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(97, 34)
						.addBox(9.571F, -1.6902F, -2.1293F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.262F, -66.687F, -5.89F, 1.5708F, 0.0F, 0.0F));

		PartDefinition Horn_r10 = Head.addOrReplaceChild("Horn_r10",
				CubeListBuilder.create().texOffs(97, 71).addBox(-1.1751F, -2.4223F, -0.6081F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.926F, -70.677F, -9.215F, -0.0816F, -0.1253F, 0.7613F));

		PartDefinition Horn_r11 = Head.addOrReplaceChild("Horn_r11",
				CubeListBuilder.create().texOffs(98, 0).addBox(-0.6008F, -0.6368F, 0.6637F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.926F, -71.475F, -11.21F, 0.3655F, -0.147F, 0.3655F));

		PartDefinition Horn_r12 = Head.addOrReplaceChild("Horn_r12",
				CubeListBuilder.create().texOffs(102, 0).addBox(-1.282F, -1.584F, -0.5333F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.261F, -71.475F, -9.614F, 0.0F, 0.0F, -0.7854F));

		PartDefinition Horn_r13 = Head.addOrReplaceChild("Horn_r13",
				CubeListBuilder.create().texOffs(104, 37).addBox(-0.75F, -2.116F, -0.1343F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.261F, -71.475F, -9.614F, 0.0F, 0.0F, -0.3927F));

		PartDefinition HeadSidePiece_r1 = Head.addOrReplaceChild("HeadSidePiece_r1",
				CubeListBuilder.create().texOffs(44, 100).addBox(-3.7635F, -2.6741F, -3.2707F, 2.0F, 7.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.852F, -66.155F, -0.57F, 0.2559F, 0.056F, -0.211F));

		PartDefinition HeadSidePiece_r2 = Head.addOrReplaceChild("HeadSidePiece_r2",
				CubeListBuilder.create().texOffs(102, 66).addBox(0.511F, 1.0037F, -3.9592F, 2.0F, 6.0F, 7.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.788F, -68.815F, -0.57F, 0.258F, -0.045F, 0.1687F));

		PartDefinition BackPiece_r1 = Head.addOrReplaceChild("BackPiece_r1",
				CubeListBuilder.create().texOffs(86, 22).addBox(-4.425F, -2.7796F, -6.9133F, 8.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -69.347F, 9.006F, 0.2618F, 0.0F, 0.0F));

		PartDefinition head_r2 = Head.addOrReplaceChild("head_r2",
				CubeListBuilder.create().texOffs(0, 59)
						.addBox(-3.957F, -1.9142F, -8.895F, 7.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 81)
						.addBox(-4.425F, -2.3822F, -7.831F, 8.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -67.751F, 2.622F, 0.2618F, 0.0F, 0.0F));

		PartDefinition SidePiece_r1 = Head.addOrReplaceChild("SidePiece_r1",
				CubeListBuilder.create().texOffs(0, 96).addBox(8.491F, 0.2828F, -3.575F, 2.0F, 5.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.32F, -61.899F, 0.494F, 0.0F, 0.0F, -0.1745F));

		PartDefinition SidePiece_r2 = Head.addOrReplaceChild("SidePiece_r2",
				CubeListBuilder.create().texOffs(22, 100).addBox(-1.085F, -1.4462F, -3.575F, 2.0F, 5.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.32F, -61.899F, 0.494F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Horns = Head.addOrReplaceChild("Horns", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition ArmHold = partdefinition.addOrReplaceChild("ArmHold", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_finger_r1 = ArmHold.addOrReplaceChild("right_finger_r1", CubeListBuilder.create()
				.texOffs(55, 100).addBox(-0.1363F, -4.8333F, -6.4231F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(100, 66).addBox(-0.1363F, -4.8333F, -4.9031F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(33, 18).addBox(-0.8963F, -2.8333F, -0.9131F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 61).addBox(-1.2763F, -3.0733F, 0.6069F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.128F, -53.01F, 6.612F, 1.5708F, -1.309F, -1.6581F));

		PartDefinition right_finger_r2 = ArmHold.addOrReplaceChild("right_finger_r2", CubeListBuilder.create()
				.texOffs(42, 27).addBox(-1.052F, -4.2959F, -5.9272F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 43).addBox(-1.052F, -4.2959F, -4.4072F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(47, 100).addBox(-1.052F, -4.4459F, -0.7972F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 96).addBox(-1.052F, -4.4459F, 0.7228F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(102, 79).addBox(-0.292F, -3.1159F, 4.7128F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 102).addBox(-0.292F, -3.1159F, 6.2328F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.128F, -54.34F, -5.168F, -1.5708F, -1.0472F, 1.4835F));

		PartDefinition chest_r1 = ArmHold.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(88, 86)
				.addBox(-23.0713F, -5.9086F, 5.3845F, 9.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 67)
				.addBox(-14.1413F, -3.6686F, 2.3445F, 9.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(104, 100)
				.addBox(-4.8213F, -3.4286F, 0.8245F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.36F, -46.8631F, 6.574F, 3.0067F, 0.4237F, 2.7784F));

		PartDefinition chest_r2 = ArmHold.addOrReplaceChild("chest_r2",
				CubeListBuilder.create().texOffs(33, 18).addBox(-5.6347F, -2.2652F, -1.577F, 4.0F, 5.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.4F, -46.8631F, 1.444F, 3.1416F, 0.7854F, 2.7489F));

		PartDefinition chest_r3 = ArmHold.addOrReplaceChild("chest_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-2.1147F, -2.2652F, -0.437F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.4F, -46.8631F, 1.444F, 0.0F, 1.5708F, -0.3927F));

		PartDefinition chest_r4 = ArmHold.addOrReplaceChild("chest_r4",
				CubeListBuilder.create().texOffs(24, 82).addBox(-4.4685F, -2.7015F, 0.0442F, 5.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-10.26F, -46.8631F, -2.356F, 0.0F, 1.1781F, -0.3927F));

		PartDefinition chest_r5 = ArmHold.addOrReplaceChild("chest_r5",
				CubeListBuilder.create().texOffs(49, 23).addBox(-4.01F, -1.8062F, 0.8254F, 5.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.93F, -48.3831F, -6.346F, 0.0F, 0.7854F, -0.3927F));

		PartDefinition chest_r6 = ArmHold.addOrReplaceChild("chest_r6",
				CubeListBuilder.create().texOffs(13, 96)
						.addBox(-0.4628F, 1.3114F, 0.0654F, 5.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 71)
						.addBox(4.7372F, 1.0714F, -0.6946F, 15.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.88F, -53.3231F, -6.346F, 0.0F, 0.0F, -0.3927F));

		PartDefinition right_Shoulder_r1 = ArmHold.addOrReplaceChild("right_Shoulder_r1",
				CubeListBuilder.create().texOffs(95, 53)
						.addBox(-6.52F, -13.36F, 15.808F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-5.16F, -21.64F, 6.688F, 12.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(58, 23)
						.addBox(-6.2F, -12.84F, 8.208F, 10.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(23.94F, -39.406F, 0.494F, 0.0F, -1.5708F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_finger_r3 = RightArm.addOrReplaceChild("right_finger_r3",
				CubeListBuilder.create().texOffs(45, 18).addBox(-0.1071F, 1.888F, 2.9286F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.428F, -27.968F, 1.292F, 0.6129F, -1.3083F, -1.5269F));

		PartDefinition right_finger_r4 = RightArm.addOrReplaceChild("right_finger_r4",
				CubeListBuilder.create().texOffs(16, 59).addBox(-0.1071F, -1.2065F, -0.7419F, 1.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.428F, -27.968F, 1.292F, 1.4419F, -1.3083F, -1.5269F));

		PartDefinition right_finger_r5 = RightArm.addOrReplaceChild("right_finger_r5",
				CubeListBuilder.create().texOffs(66, 37).addBox(-0.5913F, -0.3576F, -0.0024F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.428F, -24.244F, 1.159F, -2.3998F, -1.4399F, 1.4835F));

		PartDefinition right_finger_r6 = RightArm.addOrReplaceChild("right_finger_r6",
				CubeListBuilder.create().texOffs(0, 67).addBox(4.32F, -0.1857F, -0.6028F, 1.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.428F, -29.564F, -3.097F, -1.5708F, -1.4399F, 1.4835F));

		PartDefinition right_finger_r7 = RightArm.addOrReplaceChild("right_finger_r7",
				CubeListBuilder.create().texOffs(22, 105).addBox(-3.6503F, -0.2886F, -2.1304F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.428F, -24.51F, 1.026F, -2.3998F, -1.4399F, 1.4835F));

		PartDefinition right_finger_r8 = RightArm.addOrReplaceChild("right_finger_r8",
				CubeListBuilder.create().texOffs(70, 71).addBox(-2.7193F, -0.3576F, -0.0024F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.428F, -24.51F, 0.228F, -2.3998F, -1.4399F, 1.4835F));

		PartDefinition right_finger_r9 = RightArm.addOrReplaceChild("right_finger_r9",
				CubeListBuilder.create().texOffs(65, 82).addBox(-0.5913F, -0.3576F, -0.0024F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.428F, -24.51F, -0.304F, -2.3998F, -1.4399F, 1.4835F));

		PartDefinition right_finger_r10 = RightArm.addOrReplaceChild("right_finger_r10",
				CubeListBuilder.create().texOffs(78, 8).addBox(4.32F, -0.1857F, -0.6028F, 1.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.428F, -29.83F, -4.56F, -1.5708F, -1.4399F, 1.4835F));

		PartDefinition right_finger_r11 = RightArm.addOrReplaceChild("right_finger_r11",
				CubeListBuilder.create().texOffs(0, 81).addBox(2.192F, -0.1857F, -0.6028F, 1.0F, 5.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.428F, -29.83F, -4.028F, -1.5708F, -1.4399F, 1.4835F));

		PartDefinition right_finger_r12 = RightArm.addOrReplaceChild("right_finger_r12",
				CubeListBuilder.create().texOffs(104, 66).addBox(1.128F, -1.2497F, -1.1348F, 1.0F, 5.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.428F, -29.83F, -3.23F, -1.5708F, -1.4399F, 1.4835F));

		PartDefinition right_hand_r1 = RightArm.addOrReplaceChild("right_hand_r1",
				CubeListBuilder.create().texOffs(111, 0).addBox(-1.808F, 2.64F, -0.532F, 5.0F, 8.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.428F, -36.746F, -0.836F, 0.0F, -1.5708F, -0.0873F));

		PartDefinition right_arm2_r1 = RightArm.addOrReplaceChild("right_arm2_r1",
				CubeListBuilder.create().texOffs(84, 100).addBox(-2.808F, -2.68F, -2.128F, 6.0F, 8.0F, 4.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-15.428F, -36.746F, -0.038F, 0.0F, -1.5708F, -0.0873F));

		PartDefinition right_Shoulder_r2 = RightArm.addOrReplaceChild("right_Shoulder_r2",
				CubeListBuilder.create().texOffs(24, 51).addBox(-5.44F, -18.64F, 34.048F, 10.0F, 8.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(23.94F, -39.406F, 0.494F, 0.0F, -1.5708F, 0.0F));

		PartDefinition right_arm_r1 = RightArm.addOrReplaceChild("right_arm_r1",
				CubeListBuilder.create().texOffs(87, 3).addBox(-3.409F, -11.34F, 4.256F, 7.0F, 14.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-21.812F, -39.406F, 0.494F, 0.0F, 1.5708F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(34, 30)
				.addBox(0.968F, -32.038F, -2.5855F, 8.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(60, 86)
				.addBox(1.208F, -19.208F, -2.5855F, 7.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 110)
				.addBox(2.688F, -8.748F, -1.0655F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_thigh_r1 = LeftLeg.addOrReplaceChild("left_thigh_r1",
				CubeListBuilder.create().texOffs(95, 40).addBox(-3.012F, -1.658F, -9.6915F, 4.0F, 2.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.56F, -0.57F, 3.876F, 0.0F, -0.3927F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(0, 38)
				.addBox(-8.532F, -32.038F, -2.5855F, 8.0F, 13.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 82)
				.addBox(-8.292F, -19.018F, -2.5855F, 7.0F, 11.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(100, 110)
				.addBox(-6.812F, -7.748F, -1.0655F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_thigh_r1 = RightLeg.addOrReplaceChild("right_thigh_r1",
				CubeListBuilder.create().texOffs(94, 22).addBox(-1.112F, -2.608F, -9.5015F, 4.0F, 2.0F, 10.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.56F, 0.38F, 3.686F, 0.0F, 0.3927F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(66, 37)
				.addBox(-6.7437F, -40.1282F, -1.5914F, 13.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(70, 71)
				.addBox(-5.6374F, -49.5762F, -2.1873F, 11.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-10.5728F, -58.8118F, -3.8106F, 21.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(81, 86)
				.addBox(-5.4894F, -48.9602F, -3.1183F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 82)
				.addBox(-0.4354F, -48.9602F, -3.1183F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 67)
				.addBox(-5.4894F, -46.1672F, -2.5863F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(52, 51)
				.addBox(-1.1004F, -46.1672F, -2.5863F, 5.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 70)
				.addBox(-0.6324F, -43.3742F, -2.5863F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 42)
				.addBox(-4.4894F, -43.3742F, -2.5863F, 4.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 0)
				.addBox(-6.7937F, -34.1282F, -2.3514F, 14.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(24, 38)
				.addBox(-1.4937F, -34.1282F, -3.8714F, 3.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition pelvis_r1 = Body.addOrReplaceChild("pelvis_r1",
				CubeListBuilder.create().texOffs(60, 86)
						.addBox(1.7863F, 3.7049F, -2.0854F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 100)
						.addBox(1.7863F, 1.6149F, -1.3254F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 0)
						.addBox(1.7863F, -1.4751F, -0.5654F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.52F, -31.2831F, -2.736F, 0.0F, 0.0F, -0.3927F));

		PartDefinition pelvis_r2 = Body.addOrReplaceChild("pelvis_r2", CubeListBuilder.create().texOffs(35, 100)
				.addBox(-0.4937F, 2.3749F, -2.0854F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(97, 38)
				.addBox(-0.4937F, 0.7149F, -1.3254F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 100)
				.addBox(-0.4937F, -1.8051F, -0.5654F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.52F, -31.2831F, -2.736F, 0.0F, 0.0F, 0.3927F));

		PartDefinition BackPiece_r2 = Body.addOrReplaceChild("BackPiece_r2",
				CubeListBuilder.create().texOffs(62, 104).addBox(-5.361F, 2.4698F, -1.979F, 10.0F, 8.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -61.367F, 7.942F, -0.1309F, 0.0F, 0.0F));

		PartDefinition sideab_r1 = Body.addOrReplaceChild("sideab_r1",
				CubeListBuilder.create().texOffs(60, 51).addBox(-2.7853F, 0.2349F, -1.5534F, 15.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.448F, -36.8311F, 0.494F, 0.0F, 0.0F, -1.8326F));

		PartDefinition sideab_r2 = Body.addOrReplaceChild("sideab_r2",
				CubeListBuilder.create().texOffs(60, 61).addBox(-2.7853F, -5.0851F, -1.5534F, 15.0F, 5.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.916F, -36.8311F, 0.494F, 0.0F, 0.0F, -1.309F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		ArmHold.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}