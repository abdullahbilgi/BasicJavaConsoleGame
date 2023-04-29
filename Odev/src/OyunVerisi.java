import java.util.ArrayList;

public class OyunVerisi extends Karakterler{

    private ArrayList<Sovalye> sovalyeler = new ArrayList<Sovalye>();
    private ArrayList<Sovalye> aktifSovalyeler = new ArrayList<Sovalye>();
    private ArrayList<Dusman> dusmanlar = new ArrayList<Dusman>();
    private ArrayList<Dusman> aktifDusmanlar = new ArrayList<Dusman>();
    private ArrayList<Sans> sanslar = new ArrayList<Sans>();
    private Sans sans;




    Sovalye[] S = new Sovalye[10];//Objeleri geçiçi olarak tutacak diziler
    Sovalye [] sG = new Sovalye[5];
    Sovalye [] sZ = new Sovalye[5];
    Dusman [] D = new Dusman[10];
    Dusman [] dG = new Dusman[5];
    Dusman [] dZ = new Dusman[5];


    Sovalye s1 = new GucluSovalye("S1","Güçlü Şovalye",1,1,true);
    Sovalye s2 = new GucluSovalye("S2","Güçlü Şovalye",1,1,true);
    Sovalye s3 = new GucluSovalye("S3","Güçlü Şovalye",1,1,true);
    Sovalye s4 = new GucluSovalye("S4","Güçlü Şovalye",1,1,true);
    Sovalye s5 = new GucluSovalye("S5","Güçlü Şovalye",1,1,true);

    Sovalye s6 = new ZayifSovalye("S6","Zayıf Şövalye",2,1,true);
    Sovalye s7 = new ZayifSovalye("S7","Zayıf Şövalye",2,1,true);
    Sovalye s8 = new ZayifSovalye("S8","Zayıf Şövalye",2,1,true);
    Sovalye s9 = new ZayifSovalye("S9","Zayıf Şövalye",2,1,true);
    Sovalye s10 = new ZayifSovalye("S10","Zayıf Şövalye",2,1,true);

    Dusman d1 = new Dusman("D1","Güçlü Düşman",1,true);
    Dusman d2 = new Dusman("D2","Güçlü Düşman",1,true);
    Dusman d3 = new Dusman("D3","Güçlü Düşman",1,true);
    Dusman d4 = new Dusman("D4","Güçlü Düşman",1,true);
    Dusman d5 = new Dusman("D5","Güçlü Düşman",1,true);

    Dusman d6 = new Dusman("D6","Zayıf Düşman",2,true);
    Dusman d7 = new Dusman("D7","Zayıf Düşman",2,true);
    Dusman d8 = new Dusman("D8","Zayıf Düşman",2,true);
    Dusman d9 = new Dusman("D9","Zayıf Düşman",2,true);
    Dusman d10 = new Dusman("D10","Zayıf Düşman",2,true);




    public OyunVerisi() {
        super();


        sG[0]=s1; sG[1]=s2; sG[2]=s3; sG[3]=s4; sG[4]=s5;//Objeleri arrayliste çekmek için diziye ekledim
        sZ[0]=s6; sZ[1]=s7; sZ[2]=s8; sZ[3]=s9; sZ[4]=s10;
        dG[0]=d1; dG[1]=d2; dG[2]=d3; dG[3]=d4; dG[4]=d5;
        dZ[0]=d6; dZ[1]=d7; dZ[2]=d8; dZ[3]=d9; dZ[4]=d10;

        for (int i = 0; i < 5; i++) {//Sovalyeler ve Dusmanlar dizileri olusturuldu
            S[i]=sG[i];
            S[i+5]=sZ[i];

            D[i]=dG[i];
            D[i+5]=dZ[i];
        }

        for (int i = 0; i < S.length; i++) {//sovalyeler ve dusmanlar arraylist'e çekildi
            sovalyeler.add(S[i]);
            dusmanlar.add(D[i]);
        }


        for (int i = 0; i < 1; i++) {//aktif şövalyeler ve düşmanlar oluşturuldu

            int sayi =(int)(Math.random()*3);

            for (int j = 0; j < 2; j++) {
                aktifSovalyeler.add(sG[sayi+j]);
                aktifDusmanlar.add(dG[sayi+j]);
            }

            int sayi1 = (int)(Math.random()*2);

            for (int j = 0; j < 3; j++) {
                aktifSovalyeler.add(sZ[sayi1+j]);
                aktifDusmanlar.add(dZ[sayi1+j]);
            }

        }

        for (int i = 0; i < getAktifSovalyeler().size(); i++) {
            int sayi = (int)(Math.random()*3);
            getAktifSovalyeler().get(i).setVurusHakki(sayi+1);
        }

    }


    public ArrayList<Sovalye> getSovalyeler() {
        return sovalyeler;
    }

    public void setSovalyeler(ArrayList<Sovalye> sovalyeler) {
        this.sovalyeler = sovalyeler;
    }

    public void setAktifSovalyeler(ArrayList<Sovalye> aktifSovalyeler) {
        this.aktifSovalyeler = aktifSovalyeler;
    }

    public void setDusmanlar(ArrayList<Dusman> dusmanlar) {
        this.dusmanlar = dusmanlar;
    }

    public void setAktifDusmanlar(ArrayList<Dusman> aktifDusmanlar) {
        this.aktifDusmanlar = aktifDusmanlar;
    }

    public void setSanslar(ArrayList<Sans> sanslar) {
        this.sanslar = sanslar;
    }

    public ArrayList<Sovalye> getAktifSovalyeler() {
        return aktifSovalyeler;
    }

    public ArrayList<Dusman> getDusmanlar() {
        return dusmanlar;
    }

    public ArrayList<Dusman> getAktifDusmanlar() {
        return aktifDusmanlar;
    }

    public ArrayList<Sans> getSanslar() {
        return sanslar;
    }


}
