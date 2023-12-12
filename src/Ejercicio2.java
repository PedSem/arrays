public class Ejercicio2 {
    public static void main(String[]args){
        int[]array={-22,5,19,1,-17,0,-1,19,24,-13};
        int array2=maximo(array);
        System.out.println("El máximo del array es:");
        System.out.println(array2);


    }
    public static int maximo(int[]array){
        int max=0;
        for(int i=0;i< array.length;i++){
            if(max<array[i]){
                max=array[i];

            }
        }
        return max;

    }
}
//El número máximo es el 24.
