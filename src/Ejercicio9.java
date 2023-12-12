public class Ejercicio9 {
    public static void main(String[]args){
        int[]array1={1,2,3,4,5};
        int[]array2={1,2,3,4,5};
        System.out.println(igualarrays(array1,array2));
    }
    public static boolean igualarrays(int[]array1,int[]array2){
        if(array1==null && array2==null){
            return true;
        }
        if(array1==null || array2==null){
            return false;
        }
        if(array1.length!=array2.length){
            return false;

        }
        for(int i=0;i< array1.length;i++){
            boolean posicion=false;
            for(int j=0;j< array2.length;j++){
                if(array1!=array2){
                    posicion=true;



                }
            }
            if(!posicion){
                return false;
            }
        }
        return true;

    }
}
