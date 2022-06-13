public class SecondStep {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 4);
        //r.a = 2; Уже не нужно, так как эти значения передали через конструктор
        //r.b = 4; Уже не нужно, так как эти значения передали через конструктор
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));

        Square s = new Square(5);
        //s.l = 5; Уже не нужно, так как эти значения передали через конструктор
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));
    }

    public static int area(Rectangle r) {
        return r.a * r.b;
    }

    public static double area(Square s) {
        return s.l * s.l;
    }
}
