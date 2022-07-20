public class Distance {

    public int range;
    public int ruler;
    public int hand;

    public Distance (int a, int b, int c) {
        this.range = a;
        this.ruler = b;
        this.hand = c;
    }

    public int distance () {
        return (this.range / this.ruler) * this.hand;
    }
}
