package part2;

public class MyPolinomial {
    private double[] coeffs;

    public MyPolinomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    public void setCoeffs(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return getCoeffs().length > 0 ? getCoeffs().length - 1 : 0;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = getDegree(); i > -1; i --) {
            if (i == 0) {
                res.append(getCoeffs()[i]);
            } else {
                res.append(getCoeffs()[i]).append("x^").append(i).append("+");
            }
        }
        return res.toString().replaceAll("\\+-", "-");
    }

    public double evaluate(double x) {
        double res = 0;
        for (int i = getDegree(); i > -1; i --) {
            res += getCoeffs()[i] * Math.pow(x, i);
        }
        return res;
    }

    public MyPolinomial add(MyPolinomial right) {
        boolean thisIsMaxD = getDegree() > right.getDegree();
        MyPolinomial maxDPol = thisIsMaxD ? this : right;
        int newCountCoef = right.getCoeffs().length;
        int minCountCoef = getCoeffs().length;
        if (thisIsMaxD) {
            newCountCoef = getCoeffs().length;
            minCountCoef = right.getCoeffs().length;
        }

        double[] newCoef = new double[newCountCoef];

        for (int i = 0; i < minCountCoef; i++) {
            newCoef[i] = getCoeffs()[i] + right.getCoeffs()[i];
        }

        for (int i = minCountCoef; i < newCountCoef; i ++) {
            newCoef[i] = maxDPol.getCoeffs()[i];
        }
        return new MyPolinomial(newCoef);
    }

    public MyPolinomial multiply(MyPolinomial right) {
        double[] newCoef = new double[getCoeffs().length + right.getCoeffs().length];

        for (int i = getDegree(); i >= 0; i--) {
            for (int j = right.getDegree(); j >= 0; j--) {
                newCoef[i + j] += this.getCoeffs()[i] * right.getCoeffs()[j];
            }
        }
        if (newCoef[newCoef.length - 1] == 0.0) {
            double[] res = new double[newCoef.length - 1];
            System.arraycopy(newCoef, 0, res, 0, newCoef.length - 1);
            return new MyPolinomial(res);
        }

        return new MyPolinomial(newCoef);
    }

}
