//Leer un nùmero e imprimir si es par o impar
//Elaborado por Camilo Andrés Barragán Gómez 22/7/19
import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args) {
     Scanner leer=new Scanner(System.in);
     double n=0;
     System.out.println("Ingrese un número");
     n=leer.nextDouble();
     if(n%2==0){
         System.out.println("El número es par");
     }else{
         System.out.println("El número es impar");
     }
    }
}