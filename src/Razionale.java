//https://didatticamoderna.altervista.org/2023/09/24/operazioni-con-i-numeri-razionali-ed-esempi/

public class Razionale {
    private int numeratore;
    private int denominatore;

    public Razionale(int numeratore, int denominatore){
        if (denominatore==0){
            throw new IllegalArgumentException("Il denominatore deve essere diverso da 0");
        }else {
            this.denominatore=denominatore;
            this.numeratore=numeratore;
            ridurreFrazioneMinimiTermini();
        }

    }
    
    private  int massimoComuneDivisore(int a, int b){
            while (b != 0) {
                int regTemp = b;
                b = a % b;
                a = regTemp;
            }
            return a;
    }
        
    private void ridurreFrazioneMinimiTermini(){
        int minTermini=massimoComuneDivisore(numeratore, denominatore);
        numeratore=numeratore/minTermini;
        denominatore=denominatore/minTermini;
    }

    public Razionale sommaRazionale(Razionale razionale){
        int denominatore=this.denominatore * razionale.denominatore;
        int numeratore=this.numeratore * razionale.denominatore + razionale.numeratore * this.denominatore;

        Razionale raz=new Razionale(numeratore, denominatore);
        return raz;
    }

    public Razionale sottrazioneRazionale (Razionale razionale){
        int denominatore=this.denominatore * razionale.denominatore;
        int numeratore=this.numeratore * razionale.denominatore - razionale.numeratore * this.denominatore;

        Razionale raz=new Razionale(numeratore, denominatore);
        return raz;
    }

    public Razionale multiplicazioneRazionale(Razionale razionale){
        int denominatore=this.denominatore * razionale.denominatore;
        int numeratore=this.numeratore * razionale.numeratore;

        Razionale raz=new Razionale(numeratore, denominatore);
        return raz;
    }

    public Razionale divisioneRazionale(Razionale razionale){
        int den=this.denominatore * razionale.numeratore;
        int num=this.numeratore * razionale.denominatore;

        Razionale raz=new Razionale(num, den);
        return raz;
    }

    @Override
    public String toString() {
        return "[numeratore = " + numeratore 
              + ", denominatore = " + denominatore + "] Razionale =  "
              + numeratore + "/" + denominatore;
    }
    
}
