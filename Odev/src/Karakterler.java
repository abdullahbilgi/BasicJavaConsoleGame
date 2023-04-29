public class Karakterler {

    private String ad;
    private int id;
    private boolean aktif;


    public Karakterler(String ad,int id,boolean aktif ){//karakterler sınıfının conructer'ı oluşturuldu.
        this.ad=ad;
        this.id=id;
        this.aktif=aktif;

    }

    public Karakterler() {//karakterler sınıfının conructer'ı oluşturuldu.

    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

}
