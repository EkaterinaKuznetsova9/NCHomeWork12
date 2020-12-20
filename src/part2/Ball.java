package part2;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelda;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelda = (float)(speed * Math.cos(direction));
        this.yDelta = (float)(-speed * Math.sin(direction));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getXDelda() {
        return xDelda;
    }

    public void setXDelda(float xDelda) {
        this.xDelda = xDelda;
    }

    public float getYDelta() {
        return yDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        setX(getX() + getXDelda());
        setY(getY() + getYDelta());
    }

    public void reflectHorizontal() {
        setXDelda(-getXDelda());
    }

    public void reflectVertical() {
        setYDelta(-getYDelta());
    }

    @Override
    public String toString() {
        return "Ball[(" + getX() + "," + getY() + "), speed=(" + getXDelda() + "," + getYDelta() + ")]";
    }
}
