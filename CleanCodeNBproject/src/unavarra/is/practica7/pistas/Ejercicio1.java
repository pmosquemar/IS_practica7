package unavarra.is.practica7.pistas;


public class Ejercicio1 {
    
    public static Boolean comienzaPorAyAcabaPorS(String linea){
        return linea.startsWith("A") && linea.endsWith("S");
    }

    public static void main(String[] args) {
        // paso 1. Mejorar el naming. Cambia el nombre del método estático por algo más significativo
        // paso 2. Mejorar el naming. Cambia el nombre del parametro de entrada del método
        // paso 3. Limpiar el código. El if para evaluar si acaba por S es redundante. ¡eliminalo!
        // paso 4. Limpiar el código. El if para evaluar si empieza por A es redundante. ¡eliminalo!
        System.out.println(comienzaPorAyAcabaPorS("HOLA"));
        System.out.println(comienzaPorAyAcabaPorS("ADIOS"));
    }
    
}
