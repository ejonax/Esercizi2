import java.util.Arrays;
import java.util.List;

public class StampaIstogramma {

   public static void stampaIstogramma(List<Integer> lista) {
        for (int elemento : lista) {
            System.out.print(elemento + ": ");
            if (elemento>0){
                for (int i = 0; i < elemento; i++) {
                    System.out.print("*");
                }
            }else if (elemento==0){
                   System.err.print("zero");

            }else{
                System.out.print("-( ");
                for (int i = 0; i < (-1*elemento); i++) {
                    System.out.print("*");
                }
                System.out.print(" ) ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Integer> lista=Arrays.asList(3, 5, 2, 7, -4);
        stampaIstogramma(lista);

        List<Integer> lista2=Arrays.asList(3, -1, 2, 0, 4);
        stampaIstogramma(lista2);
    }
    
}
