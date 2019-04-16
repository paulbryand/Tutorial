package com.woodenchico.tutorialmod.init;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.woodenchico.tutorialmod.blocks.BlockBase;
import com.woodenchico.tutorialmod.blocks.RubyBlock;
import com.woodenchico.tutorialmod.blocks.RubyOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class ModBlocks
{
	public static final List<Block>BLOCKS=new ArrayList<Block>();
	public static final Block RUBY_BLOCK=new RubyBlock("ruby_block",Material.IRON);
	public static final Block DIRTY_BLOCK=new BlockBase("dirty_block",Material.GROUND);
	public static final Block RUBY_ORE=new RubyOre("ruby_ore",Material.ROCK);
}
