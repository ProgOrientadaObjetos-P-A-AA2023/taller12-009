package p3;

import java.util.ArrayList;
<<<<<<< HEAD
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
=======
import p1.*;
>>>>>>> db38de575ec28b3bde4059de9ad1d96eb3a14e6c
import p2.TipoMatricula;
import p2.Matricula;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Matricula> matriculas = new ArrayList();

        Matricula mcamp = new MatriculaCampamento();
        Matricula mcolegio = new MatriculaColegio();
        Matricula mescuela = new MatriculaEscuela();
        Matricula mjardin = new MatriculaJardin();
        Matricula mmaternal = new MatriculaMaternal();
        Matricula mmaternal2 = new MatriculaMaternal();

        matriculas.add(mcamp);
        matriculas.add(mcolegio);
        matriculas.add(mescuela);
        matriculas.add(mjardin);
        matriculas.add(mmaternal);
        matriculas.add(mmaternal2);

        for (Matricula m : matriculas) {
            m.establecerTarifa();
        }

        TipoMatricula tipos = new TipoMatricula();
<<<<<<< HEAD

        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerTarifa();

        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerTarifa();

        MatriculaEscuela mescuela = new MatriculaEscuela();
        MatriculaJardin mjardin = new MatriculaJardin();
        MatriculaMaternal mmaternal = new MatriculaMaternal();
        MatriculaMaternal mmaternal2 = new MatriculaMaternal();

        ArrayList<Matricula> lista = new ArrayList<>();
        lista.add(mcamp);
        lista.add(mcolegio);
        lista.add(mescuela);
        lista.add(mjardin);
        lista.add(mmaternal);
        lista.add(mmaternal2);

        tipos.establecerMatriculas(lista);
        tipos.establecerPromedioTarifas();
        System.out.printf("%s\n", tipos);
=======
        tipos.establecerMatriculas(matriculas);
        tipos.establecerPromedioMatriculas();

        System.out.printf("%s", tipos);
>>>>>>> db38de575ec28b3bde4059de9ad1d96eb3a14e6c
    }

}
