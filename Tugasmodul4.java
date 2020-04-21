import java.util.Scanner;
import java.io.IOException;
//test
public class Tugasmodul4 {
    
    static int menu1(int i){
        pendefinisi objek = new pendefinisi();
        String pilihanuser;
        boolean islanjutkan = true;
        while (islanjutkan){
        Scanner sc = new Scanner(System.in);
        
        objek.menu();

       i = sc.nextInt();
        switch(i){
        case(1):
            int panjang, lebar, luasp;
        System.out.println("Program menghitung luas persegi panjang");
        System.out.println("Masukan panjang = ");
        panjang = sc.nextInt();
        System.out.println("Masukan lebar = ");
        lebar = sc.nextInt();
        luasp = panjang * lebar;
        System.out.println("Luas persegi panjang adalah = " + luasp);
                break;
        case(2):
            double r, luasl;
            double phi = 3.14;
        System.out.println("Program menghitung luas lingkaran");
        System.out.println("Masukan jari-jari = ");
        r = sc.nextFloat();
        luasl = phi * (r*r) ;
        System.out.println("Luas lingkaran adalah = " + luasl);
       
                break;
        case(3) :
            int alas, tinggi, luass;
        System.out.println("Program menghitung luas segitiga");
        System.out.println("Masukan alas = ");
        alas = sc.nextInt();
        System.out.println("Masukan tinggi = ");
        tinggi = sc.nextInt();
        luass = (alas * tinggi)/2;
        System.out.println("Luas segitiga adalah = " + luass);
        break;
                    default:System.out.println("input salah");break;
        }
      System.out.print("\n apakah anda ingin lanjut ? (y/n) = ");
        pilihanuser = sc.next();
        islanjutkan = pilihanuser.equalsIgnoreCase("y");
       } return i;}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
       menu1(i);
        System.out.println("Program Selesai");
    }
}


            
           
