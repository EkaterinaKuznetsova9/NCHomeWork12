package part2;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width;
        this.y2 = y + height;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX() {
        return getX1();
    }

    public int getY() {
        return getY1();
    }

    public int getWidth() {
        return getX2() - getX1();
    }

    public int getHeight() {
        return getY2() - getY1();
    }

    public boolean collides(Ball ball) {
        return (ball.getX() + ball.getRadius() <= getX2())
                && (ball.getX() - ball.getRadius() >= getX1())
                && (ball.getY() + ball.getRadius() >= getY1())
                && (ball.getY() - ball.getRadius() <= getY2());
    }

    @Override
    public String toString() {
        return "Container[(" + getX1() + "," + getY1() + "),(" + getX2() + "," + getY2() + ")]";
    }
}
