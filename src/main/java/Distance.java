public class Distance {

    public int a;
    public int b;
    public int c;

    public Distance (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int distance () {
        return (this.a / this.b) * this.c;
    }
}
