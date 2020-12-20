package part1;

public class Main {

    public static void main(String[] args) {
        // tests for Book (and Author)
        System.out.println("***Book***");
        Author a1 = new Author("Sergei Esenin", "esenin@mail.com", 'm');
        Author a2 = new Author("Alex Pushkin", "pushkin@yandex.ru", 'm');
        Author a3 = new Author("Anna Ahmatova", "ahmat@mail.ru", 'f');
        Author[] a = new Author[] {a1, a2, a3};
        Book b = new Book("Hello, World!", a, 456.67);
        System.out.println(b.getAuthorNames());
        System.out.println(b);
        Author[] aa = b.getAuthors();

        // tests for Circle
        System.out.println("***Circle***");
        Circle c = new Circle(2.0, "green");
        System.out.println(c);
        System.out.println("Radius: " + c.getRadius());
        c.setColor("white");
        System.out.println("Area: " + c.getArea());

        // tests for Rectangle
        System.out.println("***Rectangle***");
        Rectangle r = new Rectangle(5.0f, 4.0f);
        System.out.println("Width: " + r.getWidth());
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimetr:" + r.getPerimetr());
        System.out.println(r);

        // tests for Employee
        System.out.println("***Employee***");
        Employee e = new Employee(1, "Ivan", "Ivanov", 10000);
        System.out.println("AnnualSalary: " + e.getAnnualSalary());
        System.out.println("Salary after raise: " + e.raiseSalary(10));
        System.out.println(e);

        // tests for MyPoint
        System.out.println("***MyPoint***");
        MyPoint mp = new MyPoint(3, 6);
        MyPoint mp2 = new MyPoint(2, 7);
        System.out.println("Distance: " + mp.distance(mp2));
        System.out.println("Distance to (0, 0): " + mp.distance());

        // tests for MyTriangle
        System.out.println("***MyTriangle***");
        MyPoint mpT1 = new MyPoint(3, 3);
        MyPoint mpT2 = new MyPoint(-4, 5);
        MyPoint mpT3 = new MyPoint(10, 8);
        MyTriangle tr = new MyTriangle(mpT1, mpT2, mpT3);
        System.out.println("Perimetr: " + tr.getPerimeter());
        System.out.println("Type: " + tr.getType());
        System.out.println(tr);
    }
}
