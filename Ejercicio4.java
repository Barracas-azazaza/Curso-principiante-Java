//Realizar un programa que pida al usuario 2 nùmeros y se sumen. imprimir el resultado de la suma
//Elaborado por Camilo Andrés Barragán Gómez
import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[] args){
        double n1=0;
        double n2=0;
        double suma=0;
        System.out.println("Ingrese el primer número a sumar:");
        Scanner leer=new Scanner(System.in);
        n1=leer.nextDouble();
        System.out.println("Ingrese el segundo número a sumar:");
        n2=leer.nextDouble();
        suma=(n1+n2);
        System.out.println("La suma de n1 y n2 es:"+suma);
    }
}