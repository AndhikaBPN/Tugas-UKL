package Ukl;
import java.util.Scanner;
public class Fathan {
    
    
    public double geth1(){
        Scanner baca = new Scanner(System.in);
        double h1,hh1;
        System.out.print("Nilai H1= ");
        hh1=baca.nextDouble();
        h1=hh1*0.1;
        return h1;
    }
    
    public double geth2(){
        Scanner baca = new Scanner(System.in);
        double h2,hh2;
        System.out.print("Nilai H2= ");
        hh2=baca.nextDouble();
        h2=hh2*0.1;
        return h2;
    }
    
    public double getul(){
        Scanner baca = new Scanner(System.in);
        double ul,uul;
        System.out.print("Nilai ULANGAN= ");
        uul=baca.nextDouble();
        ul=uul*0.1;
        return ul;
    }
    
    public double getuts(){
        Scanner baca = new Scanner(System.in);
        double uts,uut;
        System.out.print("Nilai UTS= ");
        uut=baca.nextDouble();
        uts=uut*0.3;
        return uts;
    }
    
    public double getpas(){
        Scanner baca = new Scanner(System.in);
        double pas,paa;
        System.out.print("Nilai PAS= ");
        paa=baca.nextDouble();
        pas=paa*0.4;
        return pas;
    }
    
    public double getna(){
        double h1=geth1();
        double h2=geth2();
        double ul=getul();
        double uts=getuts();
        double pas=getpas();
        double na=h1+h2+ul+uts+pas;
        System.out.println("Nilai Akhir= " +na);
        return na;
    }
    
    public void getpr(){
        double na=getna();
         if(na>=94 && na<=100){
             System.out.println("PREDIKAT: A");
         }else if(na>=83 && na<=93){
             System.out.println("PREDIKAT: B");
         }else if(na>=75 && na<=82){
             System.out.println("PREDIKAT: C");
         }else if(na>=50 && na<=74){
             System.out.println("PREDIKAT: D");
         }else if(na>=0 && na<=49){
             System.out.println("PREDIKAT: E");
         }
    }
}
