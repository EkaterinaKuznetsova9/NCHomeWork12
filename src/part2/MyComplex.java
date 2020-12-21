package part2;

import java.util.Objects;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        setReal(real);
        setImag(imag);
    }

    @Override
    public String toString() {
        String addStr = getImag() > 0 ? "+" : "";
        if (isReal() && isImaginary()) {
            return "(" + getReal() + addStr + getImag() + "i)";
        }
        if (isReal()) {
            return "(" + getReal() + ")";
        }
        return "(" + addStr + getImag() + "i)";
    }

    public boolean isReal() {
        return getReal() != 0.0;
    }

    public boolean isImaginary() {
        return getImag() != 0.0;
    }

    public boolean equals(double real, double imag) {
        return getReal() == real && getImag() == imag;
    }

    @Override
    public boolean equals(Object myComplex) {
        if (myComplex instanceof MyComplex) {
            return getReal() == ((MyComplex) myComplex).getReal() && getImag() == ((MyComplex) myComplex).getImag();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isReal(), getImag());
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(getReal(), 2) + Math.pow(getImag(), 2));
    }

    public double argument() {
        return Math.atan(getImag() / getReal());
    }

    public MyComplex add(MyComplex right) {
        setValue(getReal() + right.getReal(), getImag() + right.getImag());
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(getReal() + right.getReal(), getImag() + right.getImag());
    }

    public MyComplex subtract(MyComplex right) {
        setValue(getReal() + right.getReal(), getImag() + right.getImag());
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(getReal() - right.getReal(), getImag() - right.getImag());
    }

    public  MyComplex multiplay(MyComplex right) {
        setValue(getReal() * right.getReal() - getImag() * right.getImag(),
                getReal() * right.getImag() + right.getReal() * getImag());
        return this;
    }

    public  MyComplex divide(MyComplex right) {
        double newReal = (getReal() * right.getReal() + getImag() * right.getImag())
                / (Math.pow(right.getReal(), 2) + Math.pow(right.getImag(), 2));
        double newImag = (right.getReal() * getImag() - getReal() * right.getImag())
                / (Math.pow(right.getReal(), 2) + Math.pow(right.getImag(), 2));
        setValue(newReal, newImag);
        return this;
    }

    public MyComplex conjugate() {
        setValue(-1 * getReal(), -1 * getImag());
        return this;
    }
}
