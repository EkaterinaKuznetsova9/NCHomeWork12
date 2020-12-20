package part1;

public class MyPoint {
    private int x = 0;
    private int y = 0 ;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[] {getX(), getY()};
    }

    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(x - getX(), 2) + Math.pow(y - getY(), 2));
    }

    public double distance(MyPoint another) {
        return Math.sqrt(Math.pow(another.getX() - getX(), 2) + Math.pow(another.getY() - getY(), 2));
    }

    public double distance() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2));
    }
}
