import java.util.ArrayList;

public class Sequence2 {
    
    private ArrayList<Integer> myArrayList;

    //costrutore che prende un arrayList<int> in entrata
    public Sequence2(ArrayList<Integer> inputList) {
        myArrayList=inputList;
    }

    //creata per essere chiamata nella useSequence2.java
    public void stampa(ArrayList<Integer> inputList){
        System.out.print("[");
        for (int i = 0; i < inputList.size(); i++){
         System.out.print(" " + inputList.get(i));
        }
        System.out.print("]");
    }

    // il metodo prende come parametro un array di int
    public int longestIncreasing (ArrayList<Integer> inputList){
            int maxSecLength = 1;
            int curSecLength = 1;

            if (inputList.size() == 0) {
                maxSecLength=0;
            } 
            else {
                for (int i = 1; i < inputList.size(); i++) {
                    if (inputList.get(i-1) <= inputList.get(i)) {
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
