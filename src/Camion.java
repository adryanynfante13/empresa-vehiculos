public class Camion extends VehiculoCarga {

    private static final double COSTO_ADICIONAL_CAMION = 40;

    public Camion(String matricula, int diasAlquiler, double pesoMaximo) {
        super(matricula, diasAlquiler, pesoMaximo);
    }

    @Override
    public double calcularPrecio() {
        return (getDiasAlquiler() * 50) + (getPesoMaximo() * 20) + COSTO_ADICIONAL_CAMION;
    }
}
