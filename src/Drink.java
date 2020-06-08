public class Drink {
    String name;
    double price;
    boolean alcoholFree;
    Ingredient ingredient1;
    Ingredient ingredient2;
    Ingredient ingredient3;

    public int volume(){
        return ingredient1.amount + ingredient2.amount + ingredient3.amount;
    }
}
