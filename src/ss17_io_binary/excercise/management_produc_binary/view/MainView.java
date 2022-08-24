package ss17_io_binary.excercise.management_produc_binary.view;

import ss17_io_binary.excercise.management_produc_binary.controller.ProductController;

public class MainView {
    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.start();
    }
}
