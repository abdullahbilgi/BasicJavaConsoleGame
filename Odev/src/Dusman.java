public class Dusman extends Karakterler {

    private boolean durum;
    private String dusmanTipi;


    public Dusman(String ad,String dusmanTipi, int id, boolean aktif) {//dusman sınıfının conructer'ı oluşturuldu.
        super(ad, id, aktif);
        this.dusmanTipi=dusmanTipi;
    }

    public String toString(){//Objeyi yazdırmak için kullanılan metod

        return ("Düşman adı :"+getAd());
    }

}
