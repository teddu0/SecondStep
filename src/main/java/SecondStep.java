public class SecondStep {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.a = 2;
        r.b = 4;
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));

        Square s = new Square();
        s.l = 5;
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));
    }

    public static int area(Rectangle r) {
        return r.a * r.b;
    }

    public static double area(Square s) {
        return s.l * s.l;
    }
}
