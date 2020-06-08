public class DrinkTest {
    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.name = "Wódka Sour";
        drink.price = 12.5;
        drink.alcoholFree = false;
        drink.ingredient1 = new Ingredient();
        drink.ingredient1.name = "wódka";
        drink.ingredient1.amount = 60;
        drink.ingredient2 = new Ingredient();
        drink.ingredient2.name = "sok z cytryny";
        drink.ingredient2.amount = 20;
        drink.ingredient3 = new Ingredient();
        drink.ingredient3.name = "syrop cukrowy";
        drink.ingredient3.amount = 20;

        System.out.println("Przykładowy drink:");
        System.out.printf("Nazwa: %s\n", drink.name);
        System.out.printf("Cena: %.2f\n", drink.price);
        System.out.printf("Zawiera alkohol: %s\n", !drink.alcoholFree);
        System.out.println("Składniki:");
        System.out.printf("  %-20s%d ml\n", drink.ingredient1.name, drink.ingredient1.amount);
        System.out.printf("  %-20s%d ml\n", drink.ingredient2.name, drink.ingredient2.amount);
        System.out.printf("  %-20s%d ml\n", drink.ingredient3.name, drink.ingredient3.amount);
        System.out.printf("%-21s%d ml", "Pojemność drinka:", drink.volume());
    }
}
