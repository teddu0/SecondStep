public class SecondStep {
    public static void main(String[] args) {
        hello("world");

        int len = 4;
        System.out.println("Площадь квадрата со сторой " + len + " = " + area(len));

        int a = 2;
        int b = 4;
        System.out.println("Площадь прямоугольника, со сторонами " + a + " и " + b + " = "  + area(a, b));
    }

    public static void hello (String somebody) {
        System.out.println("Hello, " + somebody);
    }


    public static int area (int len){
        return len * len;
    }

    public static int area (int a, int b) {
        return a * b;
    }

}
