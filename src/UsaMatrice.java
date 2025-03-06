public class UsaMatrice {
     public static void main(String[] args) {
  
        Matrice matrice1=new Matrice(4, 4);
        matrice1.stampaMatrice();

        System.out.println("La somma totale della matrice è: " + matrice1.sommaTutti());
        System.out.println("La somma dei numeri del perimetro della matrice è: " + matrice1.sommaPerimetro());
        System.out.println("La somma dei numeri all'interno della matrice è: " + matrice1.sommaInterni());
        
        Matrice matrice2=new Matrice(2, 4);
        matrice2.stampaMatrice();

        System.out.println("La somma totale della matrice è: " + matrice2.sommaTutti());
        System.out.println("La somma dei numeri del perimetro della matrice è: " + matrice2.sommaPerimetro());
        System.out.println("La somma dei numeri all'interno della matrice è: " + matrice2.sommaInterni());

        Matrice matrice4=new Matrice(1, 4);
        matrice4.stampaMatrice();

        System.out.println("La somma totale della matrice è: " + matrice4.sommaTutti());
        System.out.println("La somma dei numeri del perimetro della matrice è: " + matrice4.sommaPerimetro());
        System.out.println("La somma dei numeri all'interno della matrice è: " + matrice4.sommaInterni());


        Matrice matrice3=new Matrice(0, 4);//test per generare exception
        matrice3.stampaMatrice();
    }
}
