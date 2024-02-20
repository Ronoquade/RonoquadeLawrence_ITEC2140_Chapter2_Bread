public class Pastries extends Bread{
    /**Class: Pastries
     * @author Ronoquade Lawrence
     * @version 1.0
     * Course: ITEC 2140 Spring 2024
     * Written: February 20, 2024
     *
     * This class is a derivative of the bread class with pastry bread starter as a new instance variable.
     */
    private double pastryStarter;
    public Pastries(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, boolean state, double pastryStarter) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state);
        this.pastryStarter = pastryStarter;
    }
    public Pastries() {
        super();
    }

    public double getPastryStarter() {
        return pastryStarter;
    }

    public void setPastryStarter(double pastryStarter) {
        this.pastryStarter = pastryStarter;
    }
    @Override
    public void recipe() {
        System.out.println("Mix in pastry starter in as well in first step.");
        super.recipe();
    }
    @Override
    public void getIngredients() {
        super.getIngredients();
        System.out.println(pastryStarter + " cup(s) of pastry starter");
    }
}
