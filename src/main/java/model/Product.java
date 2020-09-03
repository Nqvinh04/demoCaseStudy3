package model;

import java.util.Date;

public class Product {
    private int id;
//    private int catalog_id;
    private String name;
    private double price;
    private String image_link;


    public Product(int id, String name, double price,
                   String image_link) {
        this.id = id;
//        this.catalog_id = catalog_id;
        this.name = name;
        this.price = price;
        this.image_link = image_link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public int getCatalog_id() {
//        return catalog_id;
//    }
//
//    public void setCatalog_id(int catalog_id) {
//        this.catalog_id = catalog_id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage_link() {
        return image_link;
    }

    public void setImage_link(String image_link) {
        this.image_link = image_link;
    }

//    public String getImage_list() {
//        return image_list;
//    }
//
//    public void setImage_list(String image_list) {
//        this.image_list = image_list;
//    }
//
//    public Date getCreated() {
//        return created;
//    }
//
//    public void setCreated(Date created) {
//        this.created = created;
//    }
}
