import java.util.Scanner;

public class OyunYoneticisi {

    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        OyunGorunumu og = new OyunGorunumu();


        og.baslangicEkrani();


        while (true){//Ana Menüyü oluşturdum

            System.out.print("Lütfen menüden secim yapiniz (Menüyü unuttuysanız 10'a basınız) : ");
            int islem = scanner.nextInt();//ana menüde gezinmek için
            scanner.nextLine();

            if (islem == 9){//programı sınlandırır
                System.out.println("Oyunda cikiliyor...");
                break;
            }
            else if (islem == 10){//ana menüyü açar
                og.anaMenuyuGoster();
            }

            else if (islem == 1){//tüm şaövalyeleri gösterir

                og.SovalyeleriGoster();
            }

            else if (islem == 2){//aktif şövalyeleri gösterir

                og.aktifSovalyeleriGoster();
            }

            else if (islem == 3){//tüm düşmanları gösterir

                og.dusmanlariGoster();

            }

            else if (islem == 4){//aktif düşmaları gösterir

                og.aktifDusmanlariGoster();

            }

            else if (islem == 5){//adı girilen sovalyeyi gösterir


                og.sovalyeyiGoster();
            }

            else if (islem == 6){//şövalye değiştirmeye yarar

                og.sovalyeDegistir();

            }

            else if (islem == 7){//yardım menüsünü açar

                og.yardim();
            }

            else if (islem == 8){//oyunu başlatır



                while (true){//oyunu oynadığımız yer

                    if ((og.getAktifSovalyeler().size()>0) && (og.getAktifDusmanlar().size()>0)) {//oyun durumunu her tur sonrası gösterir
                        System.out.println("*******************************\n" +
                                "Oyun karakterleri : \n" +
                                "*******************************\n");

                        og.oyunDurumunuGoster();

                    }

                    if ( ( (og.getAktifSovalyeler().size()==0) && (og.getAktifDusmanlar().size()==0) ) || ( (og.getAktifSovalyeler().size()>0) && (og.getAktifDusmanlar().size()==0) ) ){//oyunu kazanma durumu
                        System.out.println("\nOyunu Kazandınız.Tebrikler!!!!");
                        break;
                    }

                    else if ((og.getAktifDusmanlar().size()>0) && (og.getAktifSovalyeler().size()==0)){//oyunu kaybetme durumu
                        System.out.println("\nOyunu Kaybettiniz.  :(");
                        break;
                    }




                    System.out.print("Kullanacağınız şövalye numarasını giriniz : ");
                    int sovalye_numarasi = scanner.nextInt();
                    System.out.print("Hedefteki düşman numarasını giriniz : ");
                    int dusman_numarasi = scanner.nextInt();



                    if ( (sovalye_numarasi>0 && dusman_numarasi>0) && (sovalye_numarasi<=5 && dusman_numarasi<=5)   ) {//hata alamamak için koyulan sınır

                        if ((og.getAktifSovalyeler().get((sovalye_numarasi - 1)).getId() == 1) && (og.getAktifDusmanlar().get((dusman_numarasi - 1)).getId() == 1)) {//güçlü şövalye güçlü düşmana saldırırsa


                            og.getAktifDusmanlar().remove(dusman_numarasi - 1);

                            if (og.getAktifSovalyeler().get(sovalye_numarasi-1).getVurusHakki()>1){
                                int sayac = og.getAktifSovalyeler().get(sovalye_numarasi-1).getVurusHakki();
                                og.getAktifSovalyeler().get(sovalye_numarasi-1).setVurusHakki(sayac-1);
                            }
                            else if (og.getAktifSovalyeler().get(sovalye_numarasi-1).getVurusHakki() == 1){
                                og.getAktifSovalyeler().remove(sovalye_numarasi - 1);
                            }

                            System.out.println("Hedef vuruldu.\nDüşman yok edildi.");

                        }
                        else if ((og.getAktifSovalyeler().get((sovalye_numarasi - 1)).getId() == 1) && (og.getAktifDusmanlar().get((dusman_numarasi - 1)).getId() == 2)) {//güçlü şövalye zayıf düşmana saldırırsa


                            og.getAktifDusmanlar().remove(dusman_numarasi - 1);

                            if (og.getAktifSovalyeler().get(sovalye_numarasi-1).getVurusHakki()>1){
                                int sayac = og.getAktifSovalyeler().get(sovalye_numarasi-1).getVurusHakki();
                                og.getAktifSovalyeler().get(sovalye_numarasi-1).setVurusHakki(sayac-1);
                            }
                            else if(og.getAktifSovalyeler().get(sovalye_numarasi-1).getVurusHakki() == 1){//
                                og.getAktifSovalyeler().remove(sovalye_numarasi - 1);
                            }

                            System.out.println("Hedef vuruldu.\nDüşman yok edildi.");

                        }
                        else if ((og.getAktifSovalyeler().get((sovalye_numarasi - 1)).getId() == 2) && (og.getAktifDusmanlar().get((dusman_numarasi - 1)).getId() == 2)) {//zayıf şövalye zayıf düşmana saldırırsa


                            og.getAktifDusmanlar().remove(dusman_numarasi - 1);

                            if ((og.getAktifSovalyeler().get(sovalye_numarasi-1).getVurusHakki())>1){
                                int sayac = og.getAktifSovalyeler().get(sovalye_numarasi-1).getVurusHakki();
                                og.getAktifSovalyeler().get(sovalye_numarasi-1).setVurusHakki(sayac-1);
                            }
                            else if (og.getAktifSovalyeler().get(sovalye_numarasi-1).getVurusHakki() == 1){//if
                                og.getAktifSovalyeler().remove(sovalye_numarasi - 1);
                            }


                            System.out.println("Hedef vuruldu.\nDüşman yok edildi.");

                        }
                        else if ((og.getAktifSovalyeler().get((sovalye_numarasi - 1)).getId() == 2) && (og.getAktifDusmanlar().get((dusman_numarasi - 1)).getId() == 1)) {//zayıf şövalye güçlü düşmana saldırırsa

                            if (og.getAktifSovalyeler().get(sovalye_numarasi-1).getVurusHakki()>1){
                                int sayac = og.getAktifSovalyeler().get(sovalye_numarasi-1).getVurusHakki();
                                og.getAktifSovalyeler().get(sovalye_numarasi-1).setVurusHakki(sayac-1);
                            }
                            else {//if (og.getAktifSovalyeler().get(sovalye_numarasi-1).getVurusHakki() == 1)
                                og.getAktifSovalyeler().remove(sovalye_numarasi - 1);
                                System.out.println("\nŞövalyeniz öldü...");
                            }

                            System.out.println("Zayıf şövalye ile Güçlü düşmana vuramazsınız...");

                        }
                    }

                    else {
                        System.out.println("\nLütfen listedeki şövalye ve düşman numaralarından birini giriniz !!!!!!\n");
                    }


                }

                Thread.sleep(3000);//estetiklik bakımından 3 saniye bekleme yaptırır

                System.out.println("OYUN BİTTİ");

                break;//programı bitirir

            }


        }


    }
}
