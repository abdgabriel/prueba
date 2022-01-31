package guia5;
//Implementar un programa que dado dos números enteros determine cuál es el
//mayor y lo muestre por pantalla

import java.util.Scanner;


public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar un numero");
        int num1=sc.nextInt();
        System.out.println("Ingresar otro numero");
        int num2=sc.nextInt();
        
        if(num1<num2){
            System.out.println("El numero "+num2+" es mayor");
        }else if(num1>num2){
            System.out.println("El numero "+num1+" es mayor" );
        }else{
            System.out.println("Los numeros son iguales");
        }
    }

}
