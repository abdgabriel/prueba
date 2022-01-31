package guia5;
//Dada una cantidad de grados centígrados se debe mostrar su equivalente en
//grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("Ingresar grados centigrados");
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int f=32+(9*c/5);
        System.out.println("Temperatura en Fahrenheit: "+f);
    }

}
