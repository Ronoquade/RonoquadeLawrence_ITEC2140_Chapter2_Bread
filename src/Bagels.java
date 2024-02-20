public class Bagels extends Bread{
    /**Class: Bagels
     * @author Ronoquade Lawrence
     * @version 1.0
     * Course: ITEC 2140 Spring 2024
     * Written: February 20, 2024
     *
     * This class is a derivative of the bread class with bagel bread starter as a new instance variable.
     */
    private double bagelStarter;
    public Bagels(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, boolean state, double bagelStarter) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state);
        this.bagelStarter = bagelStarter;
    }
    public Bagels() {
        super();
    }

    public double getBagelStarter() {
        return bagelStarter;
    }

    public void setBagelStarter(double bagelStarter) {
        this.bagelStarter = bagelStarter;
    }
    @Override
    public void recipe() {
        System.out.println("Mix in bagel starter in as well in first step.");
        super.recipe();
    }
    @Override
    public void getIngredients() {
        super.getIngredients();
        System.out.println(bagelStarter + " cup(s) of bagel starter");
    }
}
