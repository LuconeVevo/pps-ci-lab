public class Brick {
    private int w;
    private int l;

    Brick(final int w, final int l) {
        this.w = w;
        this.l = l;
    }

    @Override
    public String toString() {
        return "this brick has w: " + w + " l: " + l;
    }
}
