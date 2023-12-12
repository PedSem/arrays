
public class Ejercicio3 {

    public static void main(String[]args){
        int[]array={-22,5,19,1,-17,0,-1,19,24,-13};
        int max=0;
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        System.out.println("El máximo es:"+max);


    }

}
