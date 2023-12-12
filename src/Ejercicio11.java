public class Ejercicio11 {
    public static void main(String[]args){
        int[]src={1,2,3};
        int[]dst={1,2,3,4,5};
        System.out.println(isArrayOn(src,dst));

    }
    public static boolean isArrayOn(int[] src, int [] dst) {
        for(int i=0;i< src.length;i++){
            for(int elemento1:src){
                boolean posicion=false;
                for(int elemento2:dst){
                    if(elemento1==elemento2){
                        posicion=true;
                    }
                }
                if(!posicion){
                    return false;
                }
            }

        }
        return true;
    }


}
