package p2;

import java.util.ArrayList;
<<<<<<< HEAD
=======
import p1.*;
>>>>>>> db38de575ec28b3bde4059de9ad1d96eb3a14e6c

public class TipoMatricula {

    private double promedioMatriculas;
<<<<<<< HEAD
    //   private MatriculaCampamento campamento;
    // private MatriculaColegio colegio;
    //private MatriculaEscuela escuela;
    //private MatriculaJardin jardin;
    //private MatriculaMaternal maternal;
    // private MatriculaMaternal maternal2;
    private ArrayList<Matricula> matriculas; // puedo tener muchos tipos de Matriculas

    public void establecerMatriculas(ArrayList<Matricula> m) {
        matriculas = m;
    }

    // public void establecerMatriculaCampamento(MatriculaCampamento c) {
    //   campamento = c;
    // }
    // public void establecerMatriculaColegio(MatriculaColegio c) {
    //  colegio = c;
    //}
    //public MatriculaCampamento obtenerMatriculaCampamento() {
    //  return campamento;
    //}
    // public MatriculaColegio obtenerMatriculaColegio() {
    //   return colegio;
    //}
    public void establecerPromedioTarifas() {
        double suma = 0;
        for (int i = 0; i < obtenerMatriculas().size(); i++) {
            suma = suma + obtenerMatriculas().get(i).obtenerTarifa();
        }
        promedioMatriculas = suma / obtenerMatriculas().size();

    }

    public ArrayList<Matricula> obtenerMatriculas() {
        return matriculas;
    }

=======
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

>>>>>>> db38de575ec28b3bde4059de9ad1d96eb3a14e6c
    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }

<<<<<<< HEAD
    @Override
    public String toString() {
        return "\nIPromedio Matriculas: " + promedioMatriculas;

    }
=======
    public ArrayList<Matricula> obtenerMatriculas() {
        return matriculas;
    }

    @Override
    public String toString() {
        String mensaje = String.format("Promedio Tarifa: $%.2f\n",
                promedioMatriculas);
        return mensaje;
    }

>>>>>>> db38de575ec28b3bde4059de9ad1d96eb3a14e6c
}
