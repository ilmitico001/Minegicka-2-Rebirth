package net.ilmitico001.minegicka.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.Level;

import java.util.function.Consumer;

public class WandItem extends Item {
    private int maxMana;
    public WandItem(Properties properties, int mana) { super(properties); this.maxMana=mana;}
    public int getMaxMana() {return maxMana;}





    public InteractionResult use(Level level, Player player, InteractionHand hand) {




       // if (!level.isClientSide) {

            //player.startUsingItem(hand);
            level.playSound(
                    null,
                    player.getX(),
                    player.getY(),
                    player.getZ(),
                    SoundEvents.AMETHYST_BLOCK_RESONATE,
                    SoundSource.NEUTRAL,
                    1.0F,
                    0.4F / (level.getRandom().nextFloat() * 0.4F + 0.8F)
            );

            //level.setBlockAndUpdate(clickedBlockPos, Blocks.AMETHYST_BLOCK.defaultBlockState());
            //wand.hurtAndBreak(1,player,hand);

       //}




        return InteractionResult.SUCCESS;
    }



    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> tooltipAdder, TooltipFlag flag) {
        tooltipAdder.accept(Component.translatable("tooltip.minegicka.wand.tooltip"));
        super.appendHoverText(stack, context, tooltipDisplay, tooltipAdder, flag);
    }
}
