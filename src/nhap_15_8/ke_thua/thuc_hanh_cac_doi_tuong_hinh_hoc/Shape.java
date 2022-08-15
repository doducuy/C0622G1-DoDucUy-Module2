package nhap_15_8.ke_thua.thuc_hanh_cac_doi_tuong_hinh_hoc;

public abstract class Shape {
     String color="green";
    boolean filled=true;

    public Shape() {
    }
    public Shape(String color, boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return  "A Shape with color of xxx and filled/not filled";
    }
}
