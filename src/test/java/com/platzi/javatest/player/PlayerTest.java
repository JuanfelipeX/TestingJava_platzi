package com.platzi.javatest.player;

// import static org.junit.jupiter.api.Assertions.*;

import com.platzi.javatest.util.StringUtil;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class PlayerTest {

    @Test
    public void losses_when_dice_is_too_low(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);

        //Dice dice = new Dice(6);
        Player player = new Player(dice, 3);
        Assert.assertEquals(false, player.play());  //es lo mismo que: Assert.assertFalse(player.play()); simplemente simplificado
    }

    @Test
    public void wins_when_dice_is_big(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(4);

        //Dice dice = new Dice(6);
        Player player = new Player(dice, 2);
        Assert.assertEquals(true, player.play());
    }

    @Test
    public void tie_when_dice_is_the_same(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(3);

        //Dice dice = new Dice(6);
        Player player = new Player(dice, 3);
        Assert.assertEquals(false, player.play());
    }
}