package core.basesyntax;

Random random = new Random();
public class ColorSupplier {
    public String getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)].name();
    }
}
