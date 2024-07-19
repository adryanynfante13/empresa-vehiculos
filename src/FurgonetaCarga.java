public class FurgonetaCarga extends VehiculoCarga {

    private static final double COSTO_ADICIONAL_CARGA = 20;

    public FurgonetaCarga(String matricula, int diasAlquiler, double pesoMaximo) {
        super(matricula, diasAlquiler, pesoMaximo);
    }

    @Override
    public double calcularPrecio() {
        return (getDiasAlquiler() * 50) + (getPesoMaximo() * COSTO_ADICIONAL_CARGA);
    }
}
