public class Coche extends Vehiculo {

    private static final double PRECIO_DIARIO = 50;
    private static final double COSTO_ADICIONAL = 1.5;

    public Coche(String matricula, int diasAlquiler) {
        super(matricula, diasAlquiler);
    }

    @Override
    public double calcularPrecio() {
        return (getDiasAlquiler() * PRECIO_DIARIO) + (getDiasAlquiler() * COSTO_ADICIONAL);
    }
}
