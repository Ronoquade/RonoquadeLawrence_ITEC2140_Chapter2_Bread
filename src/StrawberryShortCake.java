public class StrawberryShortCake extends Bread{
    /**Class: StrawberryShortCake
     * @author Ronoquade Lawrence
     * @version 1.0
     * Course: ITEC 2140 Spring 2024
     * Written: February 20, 2024
     *
     * This class is a derivative of the bread class with strawberries as a new instance variable.
     */
    private int strawberry;
    public StrawberryShortCake(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, boolean state, int strawberry) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state);
        this.strawberry = strawberry;
    }
    public StrawberryShortCake() {
        super();
    }

    public int getStrawberry() {
        return strawberry;
    }

    public void setStrawberry(int strawberry) {
        this.strawberry = strawberry;
    }
    @Override
    public void recipe() {
        System.out.println("Mix in strawberries in as well in first step.");
        super.recipe();
    }
    @Override
    public void getIngredients() {
        super.getIngredients();
        System.out.println(strawberry + " strawberries");
    }
}
