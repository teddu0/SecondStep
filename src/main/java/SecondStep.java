public class SecondStep {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2, 4);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Distance d = new Distance(600, 10, 5);
        System.out.println("Расстояние до предмета высотой " + d.a + " при длине линейки " +  d.b + " и длине руки " + d.c + " = " + d.distance());
    }

}
