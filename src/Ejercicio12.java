import java.util.Scanner;

public class Ejercicio12 {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[]args){
        int[]enteros=leerenteros(6);
        imprimirArray(enteros);









    }
    public static int[]leerenteros(int elementos){
        System.out.println("Inserta:"+ elementos+" de tipo entero");
        int[]array=new int[elementos];
        for(int i=0;i< array.length;i++){
            array[i]= sc.nextInt();

        }
        return array;

    }
    public static void imprimirArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.println("Elemento:" + i + " valor:" + array[i]);
        }

    }
    public static int[] ordenarArray(int[] array) {
        int[]arrayordenado=new int[array.length];
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){


            }
        }
        return arrayordenado;






    }

}
