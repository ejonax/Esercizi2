public class QuadratoAscii {
    private int i;
    private String c;

    public QuadratoAscii(int i, String c){
        if (i<=0){
            throw new IllegalArgumentException("Si deve inserire un numero maggiore di 0");
        }else {
            this.i=i;
            this.c=c;
        }
    }

    public void Stampa(){
        
        int rowValue=this.i;

        for (int row = 0; row <rowValue ; row++) {
            if ((row==0)||(row==rowValue-1)){
                for (int col = 0; col <rowValue ; col++) {
                        System.out.print(this.c);}
            } else {
                for (int col = 0; col <rowValue ; col++) {
                    if ((col==0)||(col==rowValue-1)){
                        System.out.print(this.c);}
                    else{
                        System.out.print(" ");}
                    }
                }
            System.out.println("");
        }
    }

    
}
