public class UsaRazionale {
    public static void main(String[] args) {
        Razionale raz1=new Razionale(3, 5);
        Razionale raz2=new Razionale(7, 6);

        System.out.println(raz1.toString());
        System.out.println(raz2.toString());

        Razionale somma=raz1.sommaRazionale(raz2);
        System.out.println(somma.toString());

        Razionale raz3=new Razionale(5, 6);
        Razionale raz4=new Razionale(7, 8);
        Razionale raz5=new Razionale(3,4);

        Razionale somma1=raz3.sommaRazionale(raz4);
        Razionale sotrazione1=somma1.sottrazioneRazionale(raz5);
        System.out.println(somma1.toString());
        System.out.println(sotrazione1.toString());

        Razionale raz6=new Razionale(3, 5);
        Razionale raz7=new Razionale(7, 6);
        Razionale multiplicazioneRaz=raz6.multiplicazioneRazionale(raz7);
        System.out.println(multiplicazioneRaz.toString());

        Razionale raz8=new Razionale(3, 4);
        Razionale raz9=new Razionale(18, 81);
        Razionale divisioneRaz=raz8.divisioneRazionale(raz9);
        System.out.println(divisioneRaz.toString());

        Razionale raz10=new Razionale(3, 0);// provare exception

    }
}
