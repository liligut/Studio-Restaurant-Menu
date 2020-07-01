package restaurant;

import java.util.Arrays;
import java.util.Date;

public class MenuItem {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew = true;
    static final String[] allowedCategory = {"appetizer","main course","dessert"};

    public MenuItem(String name, double price, String description, String category) {
        setName(name);
        setPrice(price);
        setDescription(description);
        setCategory(category);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        if (Arrays.asList(allowedCategory).contains(category)){
            this.category = category;
        }else{
            this.category =null;
        }
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", category='" + category + '\'' +
                ", isNew=" + isNew +
                '}';
    }

}
