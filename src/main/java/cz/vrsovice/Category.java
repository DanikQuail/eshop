package cz.vrsovice;

import java.util.ArrayList;

public class Category {
    private final ArrayList<Product> productArrayList;

    public Category(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }

    public ArrayList<Product> getFeatured() {
        ArrayList<Product> featured = new ArrayList<>();
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).isFeatured()) {
                featured.add(productArrayList.get(i));
            }
        }
        return featured;
    }

    public ArrayList<Product> getOthers() {
        ArrayList<Product> other = new ArrayList<>();
        for (int i = 0; i < productArrayList.size(); i++) {
            if (!productArrayList.get(i).isFeatured()) {
                other.add(productArrayList.get(i));
            }
        }
        return other;
    }
}
