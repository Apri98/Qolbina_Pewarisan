public class BujurSangkar extends Bentuk {
    private double sisi;

    // Constructor
    public BujurSangkar(double sisi, String warna) {
        super(warna);
        this.sisi = sisi;
    }

    // Getter sisi
    public double getSisi() {
        return sisi;
    }

    // Setter sisi
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    // Method hitungLuas
    public double hitungLuas() {
        return sisi * sisi;
    }

    // Method printInfo (Override)
    @Override
    public void printInfo() {
        System.out.println("BujurSangkar berwarna " + getWarna() + ", luas = " + hitungLuas());
    }
}