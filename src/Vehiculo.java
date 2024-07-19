public abstract class Vehiculo {
    private String matricula;
    private int diasAlquiler;

    public Vehiculo(String matricula, int diasAlquiler) {
        this.matricula = matricula;
        this.diasAlquiler = diasAlquiler;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }

    public abstract double calcularPrecio();
}
