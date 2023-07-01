package p1;
<<<<<<< HEAD
import p2.Matricula;
/**
 *
 * @author reroes
 */
public class MatriculaCampamento extends Matricula {
    private double tarifa;
    
    
    @Override
    public void establecerTarifa(){
        // tarifa = costo transporte + costo comida + costo instructores
        tarifa = 100.2 + 30.2 + 90.2;
    }
        
=======

public class MatriculaCampamento extends Matricula {

    @Override
    public void establecerTarifa() {
        tarifa = 100.2 + 30.2 + 90.2;
    }

>>>>>>> db38de575ec28b3bde4059de9ad1d96eb3a14e6c
}
