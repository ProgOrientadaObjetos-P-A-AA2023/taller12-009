package p2;

import java.util.ArrayList;
import p1.*;

public class TipoMatricula {

    private double promedioMatriculas;
    private ArrayList<Matricula> matriculas;

    public void establecerPromedioMatriculas() {
        double suma = 0;

        for (int i = 0; i < matriculas.size(); i++) {
            suma = suma + matriculas.get(i).obtenerTarifa();
        }

        promedioMatriculas = suma / matriculas.size();
    }

    public void establecerMatriculas(ArrayList<Matricula> m) {
        matriculas = m;
    }

    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }

    public ArrayList<Matricula> obtenerMatriculas() {
        return matriculas;
    }

    @Override
    public String toString() {
        String mensaje = String.format("Promedio Tarifa: $%.2f\n",
                promedioMatriculas);
        return mensaje;
    }

}
