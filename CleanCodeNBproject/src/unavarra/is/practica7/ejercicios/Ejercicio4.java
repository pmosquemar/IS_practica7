package unavarra.is.practica7.ejercicios;

public class Ejercicio4 {
    
    
    public static String dia(int dia){

        String[] dias = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        
        switch(dia){
            case 1:
                return dias[dia - 1];
            case 2:
                return dias[dia - 1];
            case 3:
                return dias[dia - 1];
            case 4:
                return dias[dia - 1];
            case 5:
                return dias[dia - 1];
            case 6:
                return dias[dia - 1];
            case 7:
                return dias[dia - 1];
            default:
                return "dia incorrecto";
        }
    }

    public static void main(String[] args) {
        System.out.println(dia(3));
    }
    
}
