public class Ejercicio5 {
    public static void main(String[]args){
        int[]pagoSemanal={-987,688,1324,450,667,801};
        int sum=0;
        for(int j=0;j<6;j++)
            sum+=pagoSemanal[j];
        System.out.println(sum);

    }
    //Lo solucionamos haciendo que j sea solamente menor que 6 debido para que no salte una excepción para cuando sea 6.
}
