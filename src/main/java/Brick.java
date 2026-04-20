public class Brick {
    private int w;
    private int l;

    Brick(final int w, final int l) {
        this.w = w;
        this.l = l;
    }

    public int getWidth() {
        return w;
    }

    public int getLength() {
        return l;
    }

    public int getArea() {
        return w * l;
    }

    public int getPerimeter() {
        return 2 * (w + l);
    }

    public boolean canContain(final Brick other) {
        return this.w >= other.w && this.l >= other.l;
    }

    @Override
    public String toString() {
        return "this brick has w: " + w + " l: " + l;
    }
}