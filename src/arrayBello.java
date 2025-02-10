
import java.util.Arrays;

class arrayBello {
   
    public static int[] add(int[] arr,int el){
            
           int  len1=arr.length;
           int len2=len1+1;
           int[] newArray=new int[len2];
    
            //copiamo il primo array su un nuovo array che lo definiamo primo array lunghezza +1
            for (int i = 0; i < len1; i++) {
                newArray[i]=arr[i]; 
            }
            //ultimo elemento del nuovo array che è una coppia del primo array 
            //sara' l'elemento che si prende come parametro nel metodo add
            newArray[len1]=el;
            return arr=newArray;
        }
    
        public  static int get(int[] arr,int n){
            if ((n<0) || (n>=arr.length)){
                return -9999999;//valore che si presume non essistera' nella nostra array
            }else {
              return arr[n];
            }
        }
    
        public static  void print(int[] arr){
            System.out.print("[ ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(" " + arr[i] + " ");
            }
            System.out.println(" ]");
        }
    
    
        public static void main(String[] args) {
           
            int[] arr=new int[]{0, 1, 2, 45, 7, 5, 17};
            System.out.println("Stampiamo l'array appena creato");
            System.out.println(Arrays.toString(arr));
           // print(arr);
    
            // add nuovi elementi
            arr=add(arr, -3);
            arr=add(arr, 28);
            arr=add(arr, 7);

            //print l'array
            System.out.println("Stampiamo l'array dopo aver inserito elemento/i");
            print(arr);

            // ritorna l'elemento nella posizione n
           //int n=12;
            int n=3;
           //int n=-1;
           int elementoN=get(arr,n);
           System.out.println("L'elemento che si trova nella posizione " + n + " ha il valore di " + elementoN);

    }
}