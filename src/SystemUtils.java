import java.io.File;

public class SystemUtils {
    
    public static void main(String[] args) {
        
        String path1="/Users/ejonaxheka/Desktop/Neibo/";
        print(path1);
        //sizeFile(path1);
        System.out.println("Ci sono " + sizeFile(path1) + " files nella cartella " + path1);
        //sizeFolder(path)1;
        System.out.println("Ci sono " + sizeFolder(path1) + " files nella cartella " + path1);

        String path2="/Users/ejonaxheka/Desktop/";
        print(path2);
        //sizeFile(path2);
        System.out.println("Ci sono " + sizeFile(path2) + " files nella cartella " + path2);
        //sizeFolder(path2);
        System.out.println("Ci sono " + sizeFolder(path2) + " files nella cartella " + path2);

        String path3="/Users/ejonaxheka/Desktop/UNDO/undo_test/test/";//cartella vuota
        print(path3);
        //sizeFile(path3);
        System.out.println("Ci sono " + sizeFile(path3) + " files nella cartella " + path3);
        //sizeFolder(path3);
        System.out.println("Ci sono " + sizeFolder(path3) + " files nella cartella " + path3);

        
    }
        
            
    public static void print(String path){
        File cartella = new File(path);
        File[] listOfFiles = cartella.listFiles();
        if(listOfFiles != null) {
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    System.out.println("File " + listOfFiles[i].getName());
                } 
            }
        }else {
            throw  new IllegalArgumentException("Non ci sono file nella path");
        }
    }

    public static int sizeFile(String path){
        int somma=0;
        File cartella = new File(path);
        File[] listOfFiles = cartella.listFiles();
        if(listOfFiles != null) {
            for (int i = 0; i < listOfFiles.length; i++) {
                if (listOfFiles[i].isFile()) {
                    somma = somma + 1;
                } 
            }
        }else {
            somma = 0;
        }

        return somma;
    }

    public static int sizeFolder(String path){
        int somma=0;
        File cartella = new File(path);
        if (cartella.exists() && cartella.isDirectory()){

            File[] listOfFiles = cartella.listFiles();
        
            if(listOfFiles != null) {
                for (int i = 0; i < listOfFiles.length; i++) {
                   
                    if(listOfFiles[i].isDirectory()){
                        String newPath = path + listOfFiles[i].getName() + "/"; // nuovo path per la cartella che troviamo
                        sizeFolder(newPath);//recursivo per trovare i file dentro la cartella nuova trovata
                        somma = somma + sizeFolder(newPath);
                        //System.out.println(newPath);
                        //System.out.println(sizeFile(newPath));
                        //System.out.println(somma);
                    } else {
                        somma=somma+1;
                    }
                }
            }else {
                somma = 0;
            }
        }
        return somma;
    }


}
