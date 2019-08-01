//Leer un número e imprimir si es positivo o negativo
//Elaborado por Camilo Andrés Barragán Gómez
import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    double n=0;
    System.out.println("Ingrese un número");
    n=leer.nextDouble();
    if(n>0){
        System.out.println("El número ingresado es positivo");
    }else{
        if(n<0){
            System.out.println("El número ingresado es negativo");
        }else{ System.out.println("El número ingresado es 0, por tanto no tiene signo en mi opinión");
    }
}
    }
}