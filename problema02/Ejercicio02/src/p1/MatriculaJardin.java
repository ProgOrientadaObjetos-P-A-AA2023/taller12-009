package p1;

<<<<<<< HEAD
import p2.Matricula;

/**
 *
 * @author reroes
 */
public class MatriculaJardin extends Matricula {

    private double tarifa;

    @Override
    public void establecerTarifa() {
        // tarifa = costo desayunos + costo libros + costo paseos
=======
public class MatriculaJardin extends Matricula {

    @Override
    public void establecerTarifa() {
>>>>>>> db38de575ec28b3bde4059de9ad1d96eb3a14e6c
        tarifa = 50.2 + 140.2 + 40;
    }

}
