package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random rd = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();
    private static final int ballNumber = 101;

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), rd.nextInt(ballNumber));
    }
}
