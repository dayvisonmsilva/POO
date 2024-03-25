package Q34;

public class Matriz {
    private float[][] matriz;

    public Matriz(float a, float b, float c, float d) {
        matriz = new float[2][2];
        matriz[0][0] = a;
        matriz[0][1] = b;
        matriz[1][0] = c;
        matriz[1][1] = d;
    }

    public float determinante() {
        return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
    }

    @Override
    public String toString() {
        return String.format("[%.2f, %.2f]\n[%.2f, %.2f]", matriz[0][0], matriz[0][1], matriz[1][0], matriz[1][1]);
    }
}