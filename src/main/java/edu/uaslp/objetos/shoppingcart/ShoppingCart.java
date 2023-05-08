package edu.uaslp.objetos.shoppingcart;

import java.util.Collection;
import java.util.List;

public class ShoppingCart{

    private ShoppingItemCatalog shoppingItemCatalog;
    private List<ShoppingItem> shoppingItemlist;

    private int cost;
    private int itenmsCount;
     private int totalItems;

    public ShoppingCart(ShoppingItemCatalog shoppingItemCatalog) {
        this.shoppingItemCatalog = shoppingItemCatalog;
        this.shoppingItemlist = shoppingItemlist;
        this.cost = getTotalCostInCents();
        this.totalItems = getTotalItemsCount();
    }
    public void add(String code) {
        ShoppingItem item1 = shoppingItemCatalog.getItem(code);
        shoppingItemlist.add(item1);
    }

    public int getTotalCostInCents() {
        return 0;
    }

    public int getDistinctItemsCount() {

        return 0;
    }

    public int getTotalItemsCount() {
        return 0;
    }

    public List<ShoppingItem> getItems() {
        return null;
    }

    public Collection<ShoppingItem> getDistinctItems() {
        return null;
    }
}
