package okulprojesi;

public class OgrenciPojo {
    private String kimlikNo;
    public String ad;
    public String soyad;
    public int yas;
    public int okulNo;
    public int sinif;

    public OgrenciPojo(String kimlikNo, String ad, String soyad, int yas, int okulNo, int sinif) {
        this.kimlikNo = kimlikNo;
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.okulNo = okulNo;
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return kimlikNo+"\t\t\t"+ad+""+soyad+"\t\t\t" +yas+"\t\t\t"+""+okulNo+"\t\t\t'"+sinif;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
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

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }
}
