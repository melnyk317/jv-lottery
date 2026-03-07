package core.basesyntax;

import java.util.Random;

public class Lottery {
    private Random rd = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor().toString(), rd.nextInt(101));
    }
}
