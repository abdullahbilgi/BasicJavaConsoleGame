import java.util.ArrayList;
import java.util.Scanner;

public class OyunGorunumu extends OyunVerisi{

    Scanner scanner = new Scanner(System.in);

    private OyunVerisi oyunVerisi;
    private SavasMotoru savasMotoru;

    public OyunGorunumu() {

    }


    public void baslangicEkrani(){//başlangıç ekranını gösterir

        System.out.println("*********************************************\n" +
                           "Oyuna hoş geldiniz.\n" +
                           "*********************************************\n" +
                           "ANA MENÜ\n" +
                           "1.Tüm şövalyeleri göster\n2.Aktif olan şövalyeleri göster\n" +
                           "3.Tüm düşmanları göster\n4.Aktif düşmanları göster\n" +
                           "5.Adı girilen sövalye bilgilerini göster\n6.Şövalye değiştir\n" +
                           "7.Yardım\n8.Oyunu başlat\n9.Oyundan çık\n10.Ana Menü" +
                           "\n*********************************************\n");

    }

    public void anaMenuyuGoster(){//ana menüyü gösterir

        System.out.println("*********************************************\n" +
                "ANA MENÜ\n" +
                "1.Tüm şövalyeleri göster\n2.Aktif olan şövalyeleri göster\n" +
                "3.Tüm düşmanları göster\n4.Aktif düşmanları göster\n" +
                "5.Adı girilen sövalye bilgilerini göster\n6.Şövalye değiştir\n" +
                "7.Yardım\n8.Oyunu başlat\n9.Oyundan çık\n10.Ana Menü" +
                "\n*********************************************\n");


    }

    public void yardim(){//yardım için bilgi verir

        System.out.println(
                           "\n🧨Oyuna başlayınca menü işlemlerine erişmezsiniz,o yüzden oyun öncesi hazırlığınızı yapınız !" +
                                   "\n🧨Yapmak istediğiniz işlemler menüde gözükmektedir !" +
                                   "\n🧨Güçlü şövalye ile hem güçlü düşmanı hemde zayıf düşmanı vurabilirsiniz !" +
                                   "\n🧨Zayıf şövalye ile sadece zayıf düşmanı vurabilirsiniz,güçlü düşmanı vuramazsınız !" +
                                   "\n🧨Stratejinizi iyi yapınız, ✔ İYİ OYUNLAR ✔\n");

    }

    public void SovalyeleriGoster(){//tüm şövalyeleri gösterir

        oyunVerisi = new OyunVerisi();

        for (int i = 0; i < oyunVerisi.getSovalyeler().size(); i++) {
            System.out.println(oyunVerisi.getSovalyeler().get(i));

        }


    }

    public void dusmanlariGoster(){//Tüm düşmanları gösterir

        oyunVerisi = new OyunVerisi();

        for (int i = 0; i < oyunVerisi.getDusmanlar().size(); i++) {
            System.out.println(oyunVerisi.getDusmanlar().get(i));

        }


    }

    public void aktifSovalyeleriGoster(){//aktif şövalyeleri gösterir

        oyunVerisi = new OyunVerisi();

        for (int i = 0; i < oyunVerisi.getAktifSovalyeler().size(); i++) {
            System.out.println(oyunVerisi.getAktifSovalyeler().get(i));

        }
    }

    public void aktifDusmanlariGoster(){//aktif düşmanları gösterir

        oyunVerisi = new OyunVerisi();

        for (int i = 0; i < oyunVerisi.getAktifDusmanlar().size(); i++) {
            System.out.println(oyunVerisi.getAktifDusmanlar().get(i));

        }
    }


    public void sovalyeyiGoster(){//Adı girilen şövalyeyi gösterir

        for (int i = 0; i < getSovalyeler().size(); i++) {
            System.out.println("Şövalye Adı : " + getSovalyeler().get(i).getAd());
        }

        System.out.print("\nBilgilerini öğrenmek istediğiniz şövalyenin adını giriniz : ");
        String isim = scanner.nextLine();

        for (int i = 0; i < getSovalyeler().size(); i++) {
            if (isim.equals(getSovalyeler().get(i).getAd())){
                System.out.println(getSovalyeler().get(i));
            }
        }

    }

    public void oyunDurumunuGoster(){//her oynanış sonrası oyun durumunu gösterir

        System.out.println("*******************************\n" +
                           "ŞÖVALYELER VE DÜŞMANLAR : \n" +
                           "*******************************\n");

        for (int i = 0; i < getAktifSovalyeler().size(); i++) {
            System.out.println((i+1)+")******************************");
            System.out.println(getAktifSovalyeler().get(i));
            System.out.println("********************************");
        }

        System.out.println("\n");

        for (int i = 0; i <getAktifDusmanlar().size(); i++) {
            System.out.println((i+1)+")******************************");
            System.out.println(getAktifDusmanlar().get(i));
            System.out.println("********************************");

        }


    }

    public void sovalyeDegistir(){//aktif şövalye değiştirmeye yarar

        for (int i = 0; i < getAktifSovalyeler().size(); i++) {
            System.out.println((i+1)+") Şövalye Adı : " + getAktifSovalyeler().get(i).getAd() + " Şövalye Tipi : " + getAktifSovalyeler().get(i).getSovalyeTipi());
        }

        System.out.print("\nDeğiştirmek istediğiniz şövalyenin numarasını giriniz : ");
        int sayi1 = scanner.nextInt();

        getAktifSovalyeler().remove(sayi1-1);

        System.out.println("");

        for (int i = 0; i < getSovalyeler().size(); i++) {
            System.out.println((i+1)+") Şövalye Adı : " + getSovalyeler().get(i).getAd() + " Şövalye Tipi : " + getSovalyeler().get(i).getSovalyeTipi());
        }

        System.out.print("\nHangi şövalye ile değiştirmek istiyorsunuz numarasını giriniz : ");
        int sayi2 = scanner.nextInt();

        getAktifSovalyeler().add(getSovalyeler().get((sayi2-1)));

        System.out.println("\nŞövalye değiştirildi.");



    }


}
