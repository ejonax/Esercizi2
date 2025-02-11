
import java.util.ArrayList;

public class useSequence2 {
     public static void main(String[] args) {

    // creo arrayListInt come oggetto della ArrayList<Intiger>
    ArrayList<Integer> arrayListInt=new ArrayList<Integer>();
   
    //inserisco elementi nella lista che abbiamo creato come sopra
    // [1,2,0,3,4] -> 3
    arrayListInt.add(1);
    arrayListInt.add(2);
    arrayListInt.add(0);
    arrayListInt.add(3);
    arrayListInt.add(4);


    //creo oggeto della classe Sequence2 usando il costrutore che prende come parametro la ArrayList creata
    Sequence2 sequenza=new Sequence2(arrayListInt);
    System.out.print("La sequenza inserita per il controllo è ");
    sequenza.stampa(arrayListInt);
  
    //il metodo longestIncreasing ritorna un int 
    //che lo salvo nella variabile risultato e lo stampo
    int risultato= sequenza.longestIncreasing(arrayListInt);
    System.out.println(" ,la lunghezza della sequenza crescente piu' lunga è " + risultato);


    //[1,2,3,4,0,2] -> 4
    ArrayList<Integer> arrayList2=new ArrayList<Integer>();
    arrayList2.add(1);
    arrayList2.add(2);
    arrayList2.add(3);
    arrayList2.add(4);
    arrayList2.add(0);
    arrayList2.add(2);

    Sequence2 sequencza2=new Sequence2(arrayList2);
    System.out.print("La sequenza2 inserita per il controllo è ");
    sequencza2.stampa(arrayList2);
    int risultato2=sequencza2.longestIncreasing(arrayList2);
    System.out.println(" ,la lunghezza della sequenza2 crescente piu' lunga è " + risultato2);

    //[-4,-3,-1,-1,1,2] ->6
    ArrayList<Integer> arrayList3=new ArrayList<Integer>();
    arrayList3.add(-4);
    arrayList3.add(-3);
    arrayList3.add(-1);
    arrayList3.add(-1);
    arrayList3.add(1);
    arrayList3.add(2);

    Sequence2 sequencza3=new Sequence2(arrayList3);
    System.out.print("La sequenza3 inserita per il controllo è ");
    sequencza3.stampa(arrayList3);
    int risultato3=sequencza3.longestIncreasing(arrayList3);
    System.out.println(",la lunghezza della sequenza3 piu' lunga è " + risultato3);

     //[] -> 0
     ArrayList<Integer> arrayList4=new ArrayList<Integer>();
 
     Sequence2 sequencza4=new Sequence2(arrayList4);
     System.out.print("La sequenza4 inserita per il controllo è ");
     sequencza4.stampa(arrayList4);
     int risultato4=sequencza4.longestIncreasing(arrayList4);
     System.out.println(",la lunghezza della sequenza4 crescente piu' lunga è " + risultato4);

   }
}
