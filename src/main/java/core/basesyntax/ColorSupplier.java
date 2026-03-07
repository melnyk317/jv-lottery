package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random rd = new Random();

    public String getRandomColor() {
        Colors[] colors = Colors.values();
        int randomIndex = rd.nextInt(colors.length);
        return colors[randomIndex].toString();
    }
}
