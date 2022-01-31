package guia5;
//Realizar un programa que pida dos números enteros positivos por teclado y
//muestre por pantalla el siguiente menú:
//MENU
//1. Sumar
//2. Restar
//3. Multiplicar
//4. Dividir
//5. Salir
//Elija opción:

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, menu;
        String menu2="n";
        
        do{

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Seleccione una opcion");
        menu = sc.nextInt();

        switch (menu)
        {
            case 1:
                System.out.println("Ingresar un numero");
                num1 = sc.nextInt();
                System.out.println("Ingresar otro numero");
                num2 = sc.nextInt();
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println("Ingresar un numero");
                num1 = sc.nextInt();
                System.out.println("Ingresar otro numero");
                num2 = sc.nextInt();
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println("Ingresar un numero");
                num1 = sc.nextInt();
                System.out.println("Ingresar otro numero");
                num2 = sc.nextInt();
                System.out.println(num1 * num2);
                break;
            case 4:
                System.out.println("Ingresar un numero");
                num1 = sc.nextInt();
                System.out.println("Ingresar otro numero");
                num2 = sc.nextInt();
                System.out.println((double)num1 / num2);
                break;
            case 5:
                do{
                System.out.println("Desea salir?S/N");
                menu2=sc.next();
                if(!menu2.equals("s")&&!menu2.equals("n")){
                    System.out.println("Ingrese una opcion correcta!");
                }
                }while(!menu2.equals("s")&&!menu2.equals("n"));
                break;
                

        }
    }while(menu2.equals("n"));

}
}
