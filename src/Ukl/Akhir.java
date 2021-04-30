package Ukl;
import java.util.Scanner;
import java.util.Arrays;
public class Akhir {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        String Ulangi;
        do{
        String[]murid={"Adam","Bashir","Devon","Fathan","Lukman","Syihab","Yeremi"};
        System.out.println("Daftar murid: ");
        System.out.println(Arrays.toString(murid));
        
        try{
        System.out.println("\nNilai Murid: ");
        System.out.println("****************************************************");
        System.out.println("1. Adam");
        Adam aa=new Adam();
        aa.getpr();
        System.out.println("****************************************************");
        
        System.out.println("\n\n****************************************************");
        System.out.println("2. Bashir");
        Bashir ab=new Bashir();
        ab.getpr();
        System.out.println("****************************************************");
        
        System.out.println("\n\n****************************************************");
        System.out.println("3. Devon");
        Devon ac=new Devon();
        ac.getpr();
        System.out.println("****************************************************");
        
        System.out.println("\n\n****************************************************");
        System.out.println("4. Fathan");
        Fathan ad=new Fathan();
        ad.getpr();
        System.out.println("****************************************************");
        
        System.out.println("\n\n****************************************************");
        System.out.println("5. Lukman");
        Lukman ae=new Lukman();
        ae.getpr();
        System.out.println("****************************************************");
        
        System.out.println("\n\n****************************************************");
        System.out.println("6. Syihab");
        Syihab af=new Syihab();
        af.getpr();
        System.out.println("****************************************************");
        
        System.out.println("\n\n****************************************************");
        System.out.println("7. Yeremi");
        Yeremi ag=new Yeremi();
        ag.getpr();
        System.out.println("****************************************************");
        System.out.println("\n\n****************************************************");
        
        }catch(Exception a){
            System.out.println("Tolong masukkan angka bukan huruf!!!");
        }
        
        System.out.println("Apakah anda ingin mengulang? [y/n]");
        Ulangi=baca.next();
        }while("y".equals(Ulangi));
        
    }
}
