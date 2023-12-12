import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args){
        int[]array;
        Scanner scan=new Scanner(System.in);
        System.out.print("¿Cuál es el tamaño del array?");
        int size=scan.nextInt();
        array=new int[size];
        for(int i=0;i< array.length;i++){
            System.out.print("Inserta un entero:");
            array[i]= scan.nextInt();

        }
    }
    //Lo que faltaba al programa era inicializar en el new int el size para que dentro del bucle pueda poner la cantidad de numeros que permita la longitud del array.
}
