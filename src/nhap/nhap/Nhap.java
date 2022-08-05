package nhap.nhap;

public class Nhap {
    int a;
    int b;
    int c;

    public Nhap(int x, int y) {
        this.a =x;
        this.b =y;
        c = a + b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
