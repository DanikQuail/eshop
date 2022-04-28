package cz.vrsovice;

public class Product {
    private String SKU;
    private int id;
    private String name;
    private String shortDescription;
    private String type;
    private boolean isFeatured;

    public Product(String SKU, int id, String name, String shortDescription, String type, boolean isFeatured) {
        this.SKU = SKU;
        this.id = id;
        this.name = name;
        this.shortDescription = shortDescription;
        this.type = type;
        this.isFeatured = isFeatured;
    }

    public String getSKU() {
        return SKU;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getType() {
        return type;
    }

    public boolean isFeatured() {
        return isFeatured;
    }

}
