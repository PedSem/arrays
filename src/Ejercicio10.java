public class Ejercicio10 {
    public static void main(String[]args){
        int[]array1={1,2,3,4,5};
        int[]array2={5,4,3,2,1};
        System.out.println(igual(array1,array2));

    }
    public static boolean igual(int[]array1,int[]array2){
        if(array1==null && array2==null){
            return true;
        }
        if(array1==null || array2==null){
            return false;
        }
        if(array1.length != array2.length){
            return false;
        }
        boolean []nuevoarray=new boolean[array1.length];

        for(int i=0;i< array1.length;i++){
            boolean posicion=false;
            for(int j=0;j< array2.length;j++){
                if(!nuevoarray[j] && array1==array2){
                    posicion=true;
                    nuevoarray[j]=nuevoarray[i];


                }



                if(!posicion){
                    return false;
                }

            }

        }
        return true;
    }
}
