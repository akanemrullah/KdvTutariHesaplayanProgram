import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar, kdvTutari, kdvOrani = 0.18, kdvliTutar; // Degiskenler tanimlandi.

        Scanner input = new Scanner(System.in); // Scanner tanimlandi.

        System.out.print("Hosgeldiniz.\nFiyat bilgisini giriniz:");

        // Kullanicidan veri alindi ve bu veri ile matematiksel islemler gerceklestirildi.
        tutar = input.nextDouble();
        kdvTutari = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutari;

        // Kullaniciya geribildirimde bulunuldu.
        System.out.println("\n\nGirdiginiz tutar: " + tutar + "\nGirdiginiz tutarin KDV'si: " + kdvTutari + "\nKDV ile beraber genel toplam: " + kdvliTutar);
    }
}