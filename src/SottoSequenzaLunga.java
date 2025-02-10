import java.util.Scanner;

public class SottoSequenzaLunga {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quanti numeri vuoi inserire?");
        int n = input.nextInt();
        
        if (n <= 0) {
            System.out.println("Nessun numero nell'array.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Inserisci i numeri:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
       // input.close();
       //1,2,3,4,0,2
       //[1,2,0,3,4]

        int risultato = longestIncreasingSubsequence(arr);
        System.out.println("La lunghezza della sequenza crescente più lunga è: " + risultato);
    }

    public static int longestIncreasingSubsequence(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int maxLen = 1;
        int currentLen = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                currentLen++;
            } else {
                maxLen = Math.max(maxLen, currentLen);
                currentLen = 1;
            }
        }

        return Math.max(maxLen, currentLen);
    }
}