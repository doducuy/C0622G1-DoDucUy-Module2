package nhap.nhap;

public class thuat_toan {
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {
            for (int j = 10; j >=0 ; j--) {
                if( j==i+5||j==5-i){
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 4; i >=1; i--) {
            for (int j = 10; j >=1 ;j-- ) {
                if(j==i+5||j==5-i){
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}
