package guia5;
//Escribir un programa que pida una frase y la muestre toda en mayúsculas y
//después toda en minúsculas. Nota: investigar la función toUpperCase() y
//toLowerCase() en Java.
import java.util.Scanner;


public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar palabra");
        String frase=sc.nextLine();
        System.out.println("Frase en mayusculas: "+frase.toUpperCase());
        System.out.println("Frase en minusculas: "+frase.toLowerCase());
    }

}
