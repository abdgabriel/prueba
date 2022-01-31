package guia5;
//Escribir un programa que lea un número entero por teclado y muestre por pantalla
//el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función

import java.util.Scanner;

//Math.sqrt().
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar numero");
        double num=sc.nextDouble();
        System.out.println("El doble del numero es: "+(num*2));
        System.out.println("El triple del numero es: "+(num*3));
        System.out.println("La raiz cuadrada del numero es: "+Math.sqrt(num));
    }

}
