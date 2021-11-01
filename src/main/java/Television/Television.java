package Television;

import java.util.ArrayList;

public class Television {
    private String brand;
    private String name;
    private String type;

    public Television(String brand, String name, String type) {
        this.brand = brand;
        this.name = name;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
