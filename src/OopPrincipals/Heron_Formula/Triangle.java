package OopPrincipals.Heron_Formula;

public class Triangle {

    public double[] lados = new double[3];

    private boolean ehValido() {
        return (lados[0] + lados[1] > lados[2]) && (lados[0] + lados[2] > lados[1]) && (lados[1] + lados[2] > lados[0]);
    }

    public double getSemiPerimetro() {
        return (lados[0] + lados[1] + lados[2]) / 2.0;
    }

    public double getArea() {
        if (!ehValido()) {
            return 0.0;
        }

        return Math.sqrt(getSemiPerimetro() * (getSemiPerimetro() - lados[0]) * (getSemiPerimetro() - lados[1]) * (getSemiPerimetro() - lados[2]));
    }
}
