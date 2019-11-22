import java.util.ArrayList;

public class ShopInventory {

    private String name;
    private ArrayList<CocktailAccessory> stock;

    public ShopInventory(String name) {
        this.name = name;
        this.stock = new ArrayList<CocktailAccessory>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<CocktailAccessory> getStock

    {
        return this.stock;
    }

    public float totalValueOfStock() {
        // 1. Set up a running total

        float total = 0.0;

        // 2. Loop through the stock array

        for (CocktailAccessory accessory : this.stock) {

            // 3. Multiply quantity with value for individual items

            double valueOfItem = accessory.getValue() * accessory.getQuantity();

            // 4. add the result to the running total

            total += valueOfItem;
            // 5. return running total
        }

        return total;

    }
}
