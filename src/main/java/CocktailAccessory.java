public class CocktailAccessory {
    private String name;
    private int quantity;
    private double value;
    private AccessoryType accessoryType;

    public CocktailAccessory(
            String name,
            int quantity,
            double value,
            AccessoryType accessoryType
    ){
       this.name = name;
       this.quantity = quantity;
       this.value = value;
       this.accessoryType;
    }

    public String getName(){
        return this.name;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public float getValue(){
        return this.value;
    }

    public AccessoryType getAccessoryType(){
        return this.accessoryType;
    }

}
