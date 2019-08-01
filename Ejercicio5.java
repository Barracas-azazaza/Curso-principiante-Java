// Dado 4 notas de un estudiante, calcular el promedio del estudiante
// Elaborado por Camilo Andrés Barragán Gómez 28/7/19
import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de notas que va a ingresar");
        int cantidad = leer.nextInt();
        double suma=0, promedio=0, n=0;
        System.out.println("Usted va a ingresar "+cantidad+" notas");
        for(int i=1;i<=cantidad;i++){
            System.out.println("Ingrese la nota "+i);
            n = leer.nextDouble();
            suma= n+suma;
        }
        promedio=suma/cantidad;
        System.out.println("El promedio de las notas es: "+promedio);
    }
}