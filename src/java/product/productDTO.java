/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package product;

/**
 *
 * @author Buiha
 */
public class productDTO {
    private String ProductID;
    private int price;
    private String name;
    private String model;
    private boolean status;
    private String image;
    private int quantity;

    public productDTO() {
    }

    public productDTO(String ProductID, int price, String name, String model, boolean status, String image, int quantity) {
        this.ProductID = ProductID;
        this.price = price;
        this.name = name;
        this.model = model;
        this.status = status;
        this.image = image;
        this.quantity = quantity;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
}