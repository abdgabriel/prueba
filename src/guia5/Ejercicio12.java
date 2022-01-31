package guia5;
//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
//la nota se pedirá de nuevo hasta que la nota sea correcta.

import java.util.Scanner;


public class Ejercicio12 {

    public static void main(String[] args) {
        System.out.println("Ingresar la nota");
        Scanner sc=new Scanner(System.in);
        int nota;
        do{
        nota=sc.nextInt();
        }while(nota<0||nota>10);
    }

}
