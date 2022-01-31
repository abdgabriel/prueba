package guia5;
//Realizar un programa que solo permita introducir solo frases o palabras de 8 de
//largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
//un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
//imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.

import java.util.Scanner;


public class Ejercicio9 {

    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        Scanner sc=new Scanner(System.in);
        String frase=sc.nextLine();
        if(frase.length()==8){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }

}
