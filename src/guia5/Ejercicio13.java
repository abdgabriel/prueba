package guia5;

//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
//solicite números al usuario hasta que la suma de los números introducidos supere
//el límite inicial. 
import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        System.out.println("Ingresar valor limite");
        Scanner sc = new Scanner(System.in);
        int limite=sc.nextInt();
        int suma=0;
        int num;
        do{
            System.out.println("Ingresar valor");
            num=sc.nextInt();
            suma+=num;
        }while(suma<=limite);
    }

}
