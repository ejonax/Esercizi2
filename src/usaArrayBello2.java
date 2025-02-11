
import java.util.Arrays;

class usaArrayBello2 {

    public static void main(String[] args) {
           
        int[] arrayInput=new int[]{0, 1, 2, 45, 7, 5, 17};
        System.out.println("Stampiamo l'array appena creato");
        System.out.println(Arrays.toString(arrayInput));
           
    
        // add nuovi elementi
        arrayBello2 arrayBelloObject=new arrayBello2();
        int[] arrayNew=arrayBelloObject.add(arrayInput, -3);
        System.out.println("Stampiamo l'array dopo aver inserito elemento");
        arrayBelloObject.print(arrayNew);
          
        int[] arrayNew2=arrayBelloObject.add(arrayNew, 28);
        System.out.println("Stampiamo l'array dopo aver inserito elemento");
        arrayBelloObject.print(arrayNew2);

        int[] arrayNew3=arrayBelloObject.add(arrayNew2, 7);
        System.out.println("Stampiamo l'array dopo aver inserito elemento");
        arrayBelloObject.print(arrayNew3);
        
        // ritorna l'elemento nella posizione n
        //int n=12;
        int n=3;
        //int n=-1;
        int elementoN=arrayBelloObject.get(arrayNew3,n);
        System.out.println("L'elemento che si trova nella posizione " + n + " ha il valore di " + elementoN);

    }
    
}
