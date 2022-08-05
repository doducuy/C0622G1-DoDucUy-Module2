package nhap.nhap;

public class main {
    public static void main(String[] args) {
        Nhap tinhTong= new Nhap(16,3);
        System.out.println(tinhTong.getC());
        tinhTong.setC(35);
        System.out.println(tinhTong.getC());
    }
}
