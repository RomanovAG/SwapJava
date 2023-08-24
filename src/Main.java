import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        int a = 555, b = 3535;
        System.out.println("a = " + a + " " + "b = " + b);
        Point p = new Point(a, b);

        swap1(p);
        a = p.x; b = p.y;
        System.out.println("a = " + a + " " + "b = " + b);

        b = swap2(a, a=b);
        System.out.println("a = " + a + " " + "b = " + b);

        //
        a += b;
        b = a - b;
        a -= b;
        //
        System.out.println("a = " + a + " " + "b = " + b);

        //
        a ^= b;
        b = a ^ b;
        a ^= b;
        //
        System.out.println("a = " + a + " " + "b = " + b);
    }

    public static void swap1(Point p)
    {
        p.x += p.y;
        p.y = p.x - p.y;
        p.x -= p.y;
    }

    public static int swap2(int a, int b)
    {
        return a;
    }
}