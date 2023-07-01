package paquete01;

public class Televisor {

    private String marca;
    private double precio;

    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerPrecio(double m) {
        precio = m;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecio() {
        return precio;
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return String.format("TV:%s\n%s\n",
=======
        return String.format("TV: %s - %.2f\n",
>>>>>>> db38de575ec28b3bde4059de9ad1d96eb3a14e6c
                obtenerMarca(),
                obtenerPrecio());
    }

}
