public abstract class VehiculoCarga extends Vehiculo {
    private double pesoMaximo;

    public VehiculoCarga(String matricula, int diasAlquiler, double pesoMaximo) {
        super(matricula, diasAlquiler);
        this.pesoMaximo = pesoMaximo;
    }

    public double getPesoMaximo() {
        return pesoMaximo;
    }

    public void setPesoMaximo(double pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }
}
