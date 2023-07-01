package paquete03;

import java.util.ArrayList;
import paquete01.Televisor;

public class VentasTvs {

<<<<<<< HEAD
    double precioTotal;
    ArrayList<Televisor> televisores;
    String marcasVendidas;

    public void establecerTelevisores(ArrayList<Televisor> t) {
        televisores = t;
    }

    public ArrayList<Televisor> obtenerTelevisores() {
        return televisores;
    }

    public void establecerPrecioTotal() {
=======
    ArrayList<Televisor> televisores;
    double totalPrecioTvs;
    String listaMarcasVendidas;
    double televisorMasCaro;

    public VentasTvs(ArrayList<Televisor> t) {
        televisores = t;
    }

    public void establecerTelevisores(ArrayList<Televisor> t) {
        televisores = t;
    }

    public void establecerTotalPrecioTvs() {
>>>>>>> db38de575ec28b3bde4059de9ad1d96eb3a14e6c
        double s = 0;
        for (int i = 0; i < televisores.size(); i++) {
            s = s + televisores.get(i).obtenerPrecio();

        }
<<<<<<< HEAD
        precioTotal = s;

    }

    public double obtenerPrecioTotal() {
        return precioTotal;
    }

    public String obtenerMarcasVendidas() {
        return marcasVendidas;
    }

    public double totalPrecioTvs(ArrayList<Televisor> t) {
        double s = 0;
        for (int i = 0; i < t.size(); i++) {
            s = s + t.get(i).obtenerPrecio();

        }
        return s;
    }

    public double televisorMasCaro(ArrayList<Televisor> t) {
        double s = 0;
        double caro = 0;
        for (int i = 0; i < t.size(); i++) {
            s = t.get(i).obtenerPrecio();
            if (caro > s) {
                s = caro;
            }
        }

        // pass
        return s;
    }

    public String listaMarcasVendidas(ArrayList<Televisor> t) {
        String s = "";
        for (int i = 0; i < t.size(); i++) {
            s = String.format("%s%s\n", s, t.get(i).obtenerMarca());
        }
        return s;
    }
=======
        totalPrecioTvs = s;
    }

    public void establecerTelevisorMasCaro() {
        double s = 0;
        for (int i = 0; i < televisores.size(); i++) {
            if (televisores.get(i).obtenerPrecio() > s) {
                s = televisores.get(i).obtenerPrecio();

            }
        }
        televisorMasCaro = s;
    }

    public void establecerListaMarcasVendidas() {
        String s = "";
        for (int i = 0; i < televisores.size(); i++) {
            s = String.format("%s       %s\n", 
                    s, televisores.get(i).obtenerMarca());
        }
        listaMarcasVendidas = s;
    }

    public double obtenerTotalPrecioTvs() {
        return totalPrecioTvs;
    }

    public String obtenerListaMarcasVendidas() {
        return listaMarcasVendidas;
    }

    public double obtenerTelevisorMasCaro() {
        return televisorMasCaro;
    }

    public ArrayList<Televisor> obtenerTelevisores() {
        return televisores;
    }

>>>>>>> db38de575ec28b3bde4059de9ad1d96eb3a14e6c
}
