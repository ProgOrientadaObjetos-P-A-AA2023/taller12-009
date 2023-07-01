package p1;

<<<<<<< HEAD
import p2.Matricula;

/**
 *
 * @author reroes
 */
public class MatriculaColegio extends Matricula {

    private double tarifa;

    @Override
    public void establecerTarifa() {
        // tarifa = costo deportes + costo folletos + 
        //          costo uniformes + costo laboratorios
=======
public class MatriculaColegio extends Matricula {

    @Override
    public void establecerTarifa() {
>>>>>>> db38de575ec28b3bde4059de9ad1d96eb3a14e6c
        tarifa = 150.2 + 140.2 + 240.2 + 300.4;
    }

}
