package classes.Q29;

public class NumeroComplexo {
    private double real;
    private double imaginario;

    public NumeroComplexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public NumeroComplexo(double real) {
        this(real, 0);
    }

    public NumeroComplexo() {
        this(0, 0);
    }

    @Override
    public String toString() {
        return this.real + " + " + this.imaginario + "i";
    }
}
