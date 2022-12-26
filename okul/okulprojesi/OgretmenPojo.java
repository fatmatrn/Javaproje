package okulprojesi;

public class OgretmenPojo {
    public String ad;
    public String soyad;
    private String kimlikNo;
    public int yas;
    public String bolum;
    private String sicilNo;

    public OgretmenPojo(String ad, String soyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return  "\t"+kimlikNo+"\t\t\t"+ad+"\t"+soyad+"\t\t\t"+yas+"\t\t\t"+bolum+"\t\t\t"+sicilNo+"\t";
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }
}
