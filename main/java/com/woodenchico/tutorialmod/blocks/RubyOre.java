package com.woodenchico.tutorialmod.blocks;

import java.util.Random;

import com.woodenchico.tutorialmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class RubyOre extends BlockBase{
	public RubyOre(String name, Material material)
	{
		super(name,material);
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe",2);
	}
	@Override
	public Item getItemDropped(IBlockState state,Random rand, int fortune)
	{
		return ModItems.RUBY;
	}
	@Override
	public int quantityDropped(Random rand)
	{
		return rand.nextInt(4)+1;
	}
}
