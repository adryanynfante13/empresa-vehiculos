public class Microbus extends Coche {

    private static final double COSTO_ADICIONAL_MICROBUS = 2;

    public Microbus(String matricula, int diasAlquiler) {
        super(matricula, diasAlquiler);
    }

    @Override
    public double calcularPrecio() {
        return super.calcularPrecio() + COSTO_ADICIONAL_MICROBUS;
    }
}
