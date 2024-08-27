import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {

        Scanner miScanner1 = new Scanner(System.in);


        System.out.println("Bienvenido a tu evaluador de calificaciones , ingresa tu calificacion final de Ingles");
        Integer calificacionDeIngles = miScanner1.nextInt();


        System.out.println("Ahora ingresa tu calificacion final de Ciencias");
        Integer calificacionDeCiencias = miScanner1.nextInt();


        System.out.println("Ahora ingresa tu calificacion de Matematicas");
        Integer calificacionDeMatematicas = miScanner1.nextInt();

        System.out.println("Calificación: " + calificacionDeIngles);
        System.out.println("Calificación: " + calificacionDeMatematicas);
        System.out.println("Calificación: " + calificacionDeCiencias);

        //De Ingles

        if (calificacionDeIngles >= 3 || calificacionDeIngles <= 0) {
            System.out.println("Reprobaste Ingles mi rey");
        } else if (calificacionDeCiencias >= 3 || calificacionDeMatematicas <= 5) {
            System.out.println("No Reprobaste Matematicas, pero tienes una calificacion insuficiente mi rey");
        } else if (calificacionDeCiencias >= 5 || calificacionDeMatematicas <= 8) {
            System.out.println("No reprobaste Ciencias, tu calificacion es Aceptable, Muy Bien mi rey");
        } else {
            System.out.println("Excelente");
        }








//END
    }
}

