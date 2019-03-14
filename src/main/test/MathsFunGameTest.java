import org.junit.Test;

import static org.junit.Assert.*;

public class MathsFunGameTest {

    @Test
    public void play() {
        MathsFunGame game = new MathsFunGame();
        game.play();
    }

    @Test
    public void newPlay() {
        MathsFunGame game = new MathsFunGame();
        game.newPlay();
    }
}