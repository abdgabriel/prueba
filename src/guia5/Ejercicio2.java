package guia5;
//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
//por pantalla.

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre=sc.next();
        System.out.println("Su nombre es: "+nombre);
    }

}
