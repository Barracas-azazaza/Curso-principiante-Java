//Dar 4 notas y hallar promedio
//Elaborado por Camilo Andrés Barragán Gómez 22/7/19
import java.util.Scanner;
public class Ejercicio1{
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        double n1=0;
        double n2=0;
        double n3=0;
        double n4=0;
        double promedio=0;
        System.out.println("Ingrese nota 1:");
        n1=leer.nextDouble();
        System.out.println("Ingrese nota 2:");
        n2=leer.nextDouble();
        System.out.println("Ingrese nota 3:");
        n3=leer.nextDouble();
        System.out.println("Ingrese nota 4:");
        n4=leer.nextDouble();
        promedio=((n1+n2+n3+n4)/4);
        System.out.println("El promedio de las notas es:"+promedio);
    } 
}