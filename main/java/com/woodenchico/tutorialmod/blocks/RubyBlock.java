package com.woodenchico.tutorialmod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class RubyBlock extends BlockBase{

	public RubyBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe",3);
		setLightLevel(2.0F);
		//setLightOpacity(1);
		//setBlockUnbreakable();
	}
	
}
