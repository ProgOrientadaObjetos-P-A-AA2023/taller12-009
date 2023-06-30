package paquete02;

import java.util.ArrayList;
import paquete01.Televisor;
import paquete03.VentasTvs;

public class Principal {

    public static void main(String[] args) {

        Televisor t1 = new Televisor();

        t1.establecerMarca("LG-14 pulgadas");
        t1.establecerPrecio(300.2);

        Televisor t2 = new Televisor();
        t2.establecerMarca("SAMSUMG-21 pulgadas");
        t2.establecerPrecio(1300.2);

        Televisor t3 = new Televisor();
        t3.establecerMarca("RIVIERA-29 pulgadas");
        t3.establecerPrecio(2300.5);

        ArrayList<Televisor> tvs = new ArrayList<>();

        tvs.add(t1);
        tvs.add(t2);
        tvs.add(t3);

        VentasTvs v = new VentasTvs(tvs);

        v.establecerListaMarcasVendidas();
        v.establecerTelevisorMasCaro();
        v.establecerTotalPrecioTvs();

        String mensaje = "";

        for (int i = 0; i < tvs.size(); i++) {
            System.out.printf("%s  %s-------------------------------------\n",
                    mensaje,
                    tvs.get(i));
        }

        System.out.printf("  Precio total de Tv's: %.2f\n"
                + "  Televisor mas caro: %s\n"
                + "  Marcas vendidas:\n%s",
                v.obtenerTotalPrecioTvs(),
                v.obtenerTelevisorMasCaro(),
                v.obtenerListaMarcasVendidas());
    }

}
