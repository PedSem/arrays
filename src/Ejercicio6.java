public class Ejercicio6 {
    public static void main(String[]args){
        int[]array={-22, 5, 19, 1, -17, 0, -1, 19, 24, -13};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int numero:array){
            if(numero>max){
                max=numero;
            }else if(numero<min){
                min=numero;
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
