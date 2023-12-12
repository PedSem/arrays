public class Ejercicio4 {
    public static void main(String[]args){
        int[]array={-35,-13,-77,-46,-82,-2,-26};
        int array2=minimo(array);
        System.out.println("El mínimo es:"+array2);





    }
    public static int minimo(int[]array){
        int min=0;
        for(int i=0;i< array.length;i++){
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
    }


}
