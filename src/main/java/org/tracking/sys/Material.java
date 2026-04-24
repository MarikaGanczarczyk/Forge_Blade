package org.tracking.sys;

public class Material {
    private String name;
    private int quantity;

    //constructor

    public Material(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }




    public void useMaterial(int amount) {
        quantity -= amount;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Material{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
