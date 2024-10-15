public class Account {
    private String isim;
    private String soyisim;
    private double bakiye;

    public Account(String isim, String soyisim, double bakiye) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.bakiye = bakiye;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void paraYatir(double tutar) {
        if (tutar >= 0) {
            this.bakiye += tutar;
        }
    }
}
