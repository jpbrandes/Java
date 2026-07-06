package InventorySystemEnhanced;

public class ProductISE {

    private String name;
    private String price;
    private int quantity;
    private DateISE expirationDate; // This is called composition, where the ProductISE class has an object of the DateISE class as one of its attributes.

    public ProductISE(String name, String price, int quantity, DateISE expirationDate) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expirationDate = expirationDate;
    }

    public ProductISE(String name, String price, DateISE expirationDate) {
        this.name = name;
        this.price = price;
        this.quantity = 10; // Default quantity
        this.expirationDate = expirationDate;
    }

    public ProductISE(String name, DateISE expirationDate) {
        this.name = name;
        this.price = "100.00"; // Default price
        this.quantity = 10; // Default quantity
        this.expirationDate = expirationDate;
    }

    public String getName() {
        return this.name;
    }

    public String getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public DateISE getExpirationDate() {
        return this.expirationDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setExpirationDate(DateISE expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void sell(int quantitySold) {
        if (quantitySold > 0 && quantitySold <= this.quantity) {
            this.quantity -= quantitySold;
            System.out.println("Sale completed successfully! Quantity sold: " + quantitySold);
        } else {
            System.out.println("Invalid quantity for sale. Please check the available quantity.");
        }
    }

    public void purchase(int quantityPurchased) {
        if (quantityPurchased > 0) {
            this.quantity += quantityPurchased;
            System.out.println("Purchase completed successfully! Quantity purchased: " + quantityPurchased);
        } else {
            System.out.println("Invalid purchase quantity. The quantity must be greater than zero.");
        }
    }

    @Override
    public String toString() {
        return "Product: " + getName()
                + "\nPrice: " + getPrice()
                + "\nQuantity: " + getQuantity()
                + "\nExpiration Date: " + getExpirationDate();
        // String concatenation to create a string representation of the ProductISE object, including its name, price, quantity, and expiration date.
    }
}
