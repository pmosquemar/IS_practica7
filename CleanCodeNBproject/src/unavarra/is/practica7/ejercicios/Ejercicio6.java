package unavarra.is.practica7.ejercicios;


public class Ejercicio6 {
    
    public static char obtenerLetra(Dni dni){ 
        
        return dni.validarLetra();
    }


    public static void main(String[] args) {

        System.out.println("La letra correspondiente es: " + obtenerLetra(new Dni(72700123)));
    }
    
}
