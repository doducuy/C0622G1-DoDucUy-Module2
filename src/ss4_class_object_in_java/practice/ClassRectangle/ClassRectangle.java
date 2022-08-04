package ss4_class_object_in_java.practice.ClassRectangle;
public class ClassRectangle {
    int chuVi;
    int dienTich;
    int chieuDai;
    int chieuRong;

    public ClassRectangle() {
    }

    public ClassRectangle(int a, int b) {
        this.chieuDai = a;
        this.chieuRong = b;
        chuVi = (chieuDai + chieuRong) * 2;
        dienTich = chieuDai * chieuRong;
    }

    public int getChuVi() {
        return chuVi;
    }

    public void setChuVi(int chuVi) {
        this.chuVi = chuVi;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }
}


