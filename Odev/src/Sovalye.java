public class Sovalye extends Karakterler{

    private boolean durum;
    private int vurusHakki;
    private Sans sans;
    private String sovalyeTipi;


    public Sovalye(String ad,String sovalyeTipi, int id,int vurusHakki, boolean aktif) {//sovalye sınıfının conructer'ı oluşturuldu.
        super(ad, id, aktif);
        this.sovalyeTipi=sovalyeTipi;
        this.vurusHakki=vurusHakki;
    }

    public boolean isDurum() {
        return durum;
    }

    public void setDurum(boolean durum) {
        this.durum = durum;
    }

    public Sans getSans() {
        return sans;
    }

    public void setSans(Sans sans) {
        this.sans = sans;
    }

    public String getSovalyeTipi() {
        return sovalyeTipi;
    }

    public void setSovalyeTipi(String sovalyeTipi) {
        this.sovalyeTipi = sovalyeTipi;
    }

    public int getVurusHakki() {
        return vurusHakki;
    }

    public void setVurusHakki(int vurusHakki) {
        this.vurusHakki = vurusHakki;
    }

    public void vur(Dusman d){

    }

    public String toString(){//Objeyi yazdırmak için kullanılan metod

        return ("Şövalye adı :"+getAd()+"\nŞövalye Tipi :" + getSovalyeTipi() + "\nŞövalye id :"+getId()+"\nŞövalye vuruş hakkı :"+getVurusHakki()+"\n");

    }


}
