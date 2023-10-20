package org.pluarsight;


public class Product {
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Product(float price, String productName, String department) {
        this.price = price;
        this.productName = productName;
        this.department = department;
    }

    private float price;
    private String productName;
    private String department;

}
