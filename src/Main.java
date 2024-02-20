public class Main {
    public static void main(String[] args) {
        // (double flour, double water, double salt, double sugar, double bakingPowder,
        // double yeast, String breadName, boolean state, double sourdoughStarter)
        Bread bread = new Bread();
        Sourdough bread1 = new Sourdough();
        Muffins muffin = new Muffins();
        Pastries pastry = new Pastries();
        Bagels bagel = new Bagels();
        StrawberryShortCake cake = new StrawberryShortCake();

        bread.getIngredients();
        bread.recipe();
        bread.bake();
        bread1.getIngredients();
        bread1.recipe();
        bread1.setState(true);
        bread1.bake();
        muffin.getIngredients();
        muffin.recipe();
        muffin.bake();
        pastry.recipe();
        cake.recipe();
        bagel.recipe();
    }
}
