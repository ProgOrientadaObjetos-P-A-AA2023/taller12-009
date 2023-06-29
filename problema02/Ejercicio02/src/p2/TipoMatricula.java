/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class TipoMatricula {

    private double promedioMatriculas;
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

    public double obtenerPromedioMatriculas() {
        return promedioMatriculas;
    }

    @Override
    public String toString() {
        return "\nIPromedio Matriculas: " + promedioMatriculas;

    }
}
