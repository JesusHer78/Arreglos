import java.util.Scanner;

public class arreglos {
    public static void main(String[] args) {
        double[] calificaciones = new double[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Escribe la calificación [" + i + "]: ");
            calificaciones[i] = sc.nextDouble();
        }
        //no se imprime el contenido de toas las casillas del arreglo
        //solo se imrpime la dirección de memoria en donde empieza el arreglo 
        //System.out.println("calificaciones: " + calificaciones);

        //Impresión usando el for extendido 
        System.out.println("Contenido del arreglo de calificaciones: ");
        for (double calificacion : calificaciones) 
            System.out.println(calificacion);   

        System.out.println("Contenido de calificaciones : ");
        //Impresión usando el for normal
        for (int i = 0; i < calificaciones.length; i++) 
            System.out.println( calificaciones[i]);
        sc.close();
        
    }
}