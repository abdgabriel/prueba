package guia5;
//Escribir un programa que pida dos números enteros por teclado y calcule la suma
//de los dos. El programa deberá después mostrar el resultado de la suma
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar primer valor");
        num1 = sc.nextInt();
        System.out.println("Ingresar segundo valor");
        num2 = sc.nextInt();
        System.out.println("La suma es: " + (num1 + num2));
    }

}
