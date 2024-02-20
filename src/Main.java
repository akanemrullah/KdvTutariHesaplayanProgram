import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdv, genelTutar; // Degiskenler tanimlandi.

        Scanner input = new Scanner(System.in); // Scanner tanimlandi.
        System.out.print("Hosgeldiniz.\nFiyat bilgisini giriniz:");

        // Kullanicidan veri alindi ve bu veri ile matematiksel islemler gerceklestirildi.
        tutar = input.nextDouble();
        kdv = tutar * .18;
        genelTutar = tutar + kdv;

        // Kullaniciya geribildirimde bulunuldu.
        System.out.println("Girdiginiz deger: " + tutar + "\nGirdiginiz tutarin KDV'si: " + kdv + "\nKDV ile beraber genel toplam: " + genelTutar);
    }
}