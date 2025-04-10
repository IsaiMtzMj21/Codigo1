class Serie3 {
    private double x, y;
    private int n;

    public Serie3(double x, double y, int n) {
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public double evaluarSerie() {
        double suma = 0.0;
        for (int i = 1; i <= n; i++) {
            double numerador = (2 * i) * Math.pow(x, 0.5 * i);
            double denominador = Math.pow(y, 0.3 * i);
            suma += numerador / denominador;
        }
        return suma;
    }
}
