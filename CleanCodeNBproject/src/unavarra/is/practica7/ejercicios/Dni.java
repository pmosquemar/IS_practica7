package unavarra.is.practica7.ejercicios;

/**
 *
 * @author alumno
 */
public class Dni {
    private int dniNum;

    public Dni(int dniNum) {
        this.dniNum = dniNum;
    }
   
    public char validarLetra(){
        Integer r = dniNum%23;
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        
        return letrasDNI.charAt(r);
    }
    
}
    
