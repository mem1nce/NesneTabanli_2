import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        Scanner girdi2 = new Scanner(System.in);

        System.out.print("Adınızı giriniz: ");
        String isim = girdi.nextLine();

        System.out.print("Soyadınızı giriniz: ");
        String soyisim = girdi.nextLine();

        Account hesap = new Account(isim, soyisim, 0);
        System.out.println("Ad Soyad: " + hesap.getIsim() + " " + hesap.getSoyisim());
        System.out.println("Bakiye: 0");

        while (true) {
            System.out.println("Uygulamayı bitirmek için 0 giriniz");
            System.out.print("Ekleyeceğiniz miktarı girin: ");
            double tutar = girdi2.nextDouble();
            if (tutar == 0) {
                break;
            } else if (tutar < 0) {
                System.out.println("Girdiğiniz değer sıfırdan büyük olmalıdır");
                continue;
            }
            hesap.paraYatir(tutar);
            System.out.println("Bakiye: " + hesap.getBakiye());
        }
    }
}
