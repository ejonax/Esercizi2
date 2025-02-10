
public class Sequence {
  public static void main(String[] args) {

     // int[] arr = { 1,2,3,4,0,2};
      int[] arr = { 1,2,0,3,4};
     // int[] arr = { -4,-3,-1,-1,1,2};
     //int[] arr={};
   
     int risultato= longestIncreasing(arr);
     System.out.println("la lunghezza della sequenza crescente piu' lunga è " + risultato);

    }
    
    // il metodo prende come parametro un array di int
    public static int longestIncreasing (int[] arr){
            int maxSecLength = 1;
            int curSecLength = 1;

            if (arr.length == 0) {
                maxSecLength=0;
            } 
            else {
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i-1] <= arr[i]) {
                        curSecLength++;
                        if (curSecLength>maxSecLength){
                            maxSecLength=curSecLength;
                        }
                    } else {
                        if (curSecLength>maxSecLength){
                            maxSecLength=curSecLength;
                        }
                        curSecLength = 1;
                    }
                }
            }
            return maxSecLength;
    }
}