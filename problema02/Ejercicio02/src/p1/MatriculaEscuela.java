package p1;

<<<<<<< HEAD
import p2.Matricula;

/**
 *
 * @author reroes
 */
public class MatriculaEscuela extends Matricula {

    private double tarifa;

    @Override
    public void establecerTarifa() {
        // tarifa = costo libros + costo deportes + costo folletos + 
        //          costo uniformes
        tarifa = 50.2 + 40.2 + 140.2 + 200.4;
=======
public class MatriculaEscuela extends Matricula {

    @Override
    public void establecerTarifa() {
        tarifa = 50.2 + 40.2 + 140.2 + 200.4;//431
>>>>>>> db38de575ec28b3bde4059de9ad1d96eb3a14e6c
    }

}
