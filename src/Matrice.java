

public class Matrice{
    private int x,y;
    private int[][] matrice;

    public Matrice(int x, int y){
        if ((x<=0)||(y<=0)){
            throw new IllegalArgumentException("Le misure della matrice devono essere maggiore di 0");
        } 
        else {
            this.x=x;
            this.y=y;
            matrice = new int[x][y];
            
            // inseriamo gli elemnti nella matrice
            //int value=1;
            for (int i = 0; i < matrice.length; i++) {
                for(int j = 0; j < matrice[i].length; j++) {
                        // matrice[i][j]=value;
                        // value++;
                        matrice[i][j]=(int)(Math.random()* 100);
                    }
                }
            }
    }

    public void stampaMatrice(){
        System.out.println("La matrice creata è:");
        for (int i = 0; i < matrice.length; ++i) {
            System.out.print("row "+ i + ": ");
            for(int j = 0; j < matrice[i].length; ++j) {
               System.out.print(matrice[i][j]+" ");
            }
            System.out.println();
         }
    }

    public int sommaTutti(){
    int somma=0;
    for (int i = 0; i < matrice.length; ++i) {
       for(int j = 0; j < matrice[i].length; ++j) {
         somma = somma + matrice[i][j];
        }
    }
     return somma;
    }

    public int sommaInterni(){
        int sommaI=0;
        if (matrice.length<=2){ //se la matrice ha meno di due rows allora la sommaInterni=0 e ne ha solo sommaPerimetro
            sommaI = 0;
        }
        else {
            for (int i = 1; i < matrice.length-1; ++i) {
               for(int j = 1; j < matrice[i].length-1; ++j) {
                   sommaI = sommaI+ matrice[i][j];
                }
            } 
        }
        return sommaI;
    }

    public int sommaPerimetro(){
        int sommaP=0;
        if (matrice.length<=2){//se la matrice ha meno di due rows allora la sommaPerimtero è uguale alla sommaTotale
            for (int i = 0; i < matrice.length; ++i) {
                for(int j = 0; j < matrice[i].length; ++j) {
                  sommaP = sommaP + matrice[i][j];
                 }
             } 
        } else {
              for (int i = 0; i < matrice.length; i++) {
                    if ((i==0)||(i==(matrice.length-1))){ // gli elementi del primo e del ultimo row si devono sommare tutti
                        for(int j = 0; j < matrice[i].length; j++) {
                          sommaP = sommaP + matrice[i][j];
                    }
                    }
                    else { // per gli altri row dobbiamo sommare solo il primo e ultimo elemento
                        sommaP=sommaP+ matrice[i][0]+matrice[i][matrice.length-1];
                    }
            }
        }
        return sommaP;
    }

}