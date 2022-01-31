package guia5;
//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
//pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:

import java.util.Scanner;

//investigar la función equals() en Java.

public class Ejercicio8 {

    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        Scanner sc=new Scanner(System.in);
        String frase=sc.nextLine();
        if(frase.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }

}
