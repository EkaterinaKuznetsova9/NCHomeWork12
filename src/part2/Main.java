package part2;

public class Main {

    public static void main(String[] args) {
        // tests for MyComplex
        System.out.println("***MyComplex***");
        MyComplex mc = new MyComplex(4.0, 2.0);
        MyComplex mc2 = new MyComplex(4.0, 3.0);
        System.out.println(mc.getReal());
        System.out.println(mc);
        boolean isEq = mc.equals(mc2);
        System.out.println("Magnitude: " + mc.magnitude());
        MyComplex mc3 = mc.subtractNew(mc2);
        System.out.println(mc3);
        System.out.println(mc3.add(mc));
        System.out.println(mc3.conjugate());

        // tests for MyPolynomial
        System.out.println("***MyPolynomial***");
        double[] c = {4, -7, 2, 5};
        MyPolinomial mp = new MyPolinomial(c);
        double[] c2 = {3, 1, 4};
        MyPolinomial mp2 = new MyPolinomial(c2);
        System.out.println("Degree: " + mp.getDegree());
        System.out.println("Multipy: " + mp.multiply(mp2));
        System.out.println("Sum: " + mp.add(mp2));
        System.out.println(mp2);

        // tests for Ball
        System.out.println("***Ball***");
        Ball b = new Ball(5f, 5f, 3, 2, 3);
        System.out.println("XDelta: " + b.getXDelda());
        b.reflectVertical();
        System.out.println(b);
        Container container = new Container(0, 0, 15, 10);
        System.out.println("X2 = " + container.getX2() + ", Y2 = " + container.getY2());
        System.out.println("Width = " + container.getWidth());
        System.out.println("Our circle is inscribed? Answer: " + container.collides(b));
        System.out.println(container);
    }
}
