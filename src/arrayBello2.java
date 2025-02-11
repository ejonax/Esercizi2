

class arrayBello2 {
   
    public int[] add(int[] arr,int el){
            
           int len1=arr.length;
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
    
    public int get(int[] arr,int n){
            if ((n<0) || (n>=arr.length)){
                return -9999999;//valore che si presume non essistera' nella nostra array
            }else {
              return arr[n];
            }
        }
    
    public void print(int[] arr){
            System.out.print("[ ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(" " + arr[i] + " ");
            }
            System.out.println(" ]");
        }
}