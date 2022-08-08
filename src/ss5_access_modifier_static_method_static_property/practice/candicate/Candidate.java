package ss5_access_modifier_static_method_static_property.practice.candicate;

public class Candidate {
    private String ten;
    private String namSinh;
    private double diemToan;
    private double diemVan;

    public Candidate(String ten, String namSinh, double diemToan, double diemVan) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.diemToan = diemToan;
        this.diemVan = diemVan;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemVan() {
        return diemVan;
    }

    public void setDiemVan(double diemVan) {
        this.diemVan = diemVan;
    }

    public double getTotal() {
        return this.diemToan + this.diemVan;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "ten='" + ten + '\'' +
                ", namSinh='" + namSinh + '\'' +
                ", diemToan=" + diemToan +
                ", diemVan=" + diemVan +
                '}';
    }
}
