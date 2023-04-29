public class Sans {

    private boolean iyiSans;
    private boolean kotuSans;
    private int sans;
    private OyunVerisi ov;


    public  Sans(){

        for (int i = 0; i < ov.getAktifSovalyeler().size(); i++) {//şövalyelere 0 ve2 arasında ekstra vuruş hakkı sağlayan döngü
            int sans = (int) (Math.random()*2);
            ov.getAktifSovalyeler().get(i).setVurusHakki(sans+1);


        }


    }

    public int getSans() {
        return sans;
    }

    public void setSans(int sans) {
        this.sans = sans;
    }
}
