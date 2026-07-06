package InventorySystemEnhanced;

public class MainISE {

    public static void main(String[] args) {

        DateISE date1 = new DateISE(15, 8, 2029);
        DateISE date2 = new DateISE(12, 9, 2028);
        DateISE date3 = new DateISE(10, 10, 2029);

        ProductISE product1 = new ProductISE("Rice", "20.00", 50, date1);
        ProductISE product2 = new ProductISE("Beans", "10.00", date2);
        ProductISE product3 = new ProductISE("Pasta", date3);

        System.out.println("Product: " + product1.getName());
        System.out.println("Price: " + product1.getPrice());
        System.out.println("Quantity: " + product1.getQuantity());
        System.out.println("Expiration Date: " + product1.getExpirationDate());

        System.out.println("-----------------------------");

        System.out.println("Product: " + product2.getName());
        System.out.println("Price: " + product2.getPrice());
        System.out.println("Quantity: " + product2.getQuantity());
        System.out.println("Expiration Date: " + product2.getExpirationDate());

        System.out.println("------------------------------");

        System.out.println("Product: " + product3.getName());
        System.out.println("Price: " + product3.getPrice());
        System.out.println("Quantity: " + product3.getQuantity());
        System.out.println("Expiration Date: " + product3.getExpirationDate());
    }
}
