public class Sourdough extends Bread{
    /**Class: Sourdough
     * @author Ronoquade Lawrence
     * @version 1.0
     * Course: ITEC 2140 Spring 2024
     * Written: February 20, 2024
     *
     * This class is a derivative of the bread class that has sourdough bread starter as a new instance variable.
     */
    private double sourdoughStarter;
    public Sourdough(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, boolean state, double sourdoughStarter) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state);
        this.sourdoughStarter = sourdoughStarter;
    }
    public Sourdough() {
        super();
    }

    public double getSourdoughStarter() {
        return sourdoughStarter;
    }

    public void setSourdoughStarter(double sourdoughStarter) {
        this.sourdoughStarter = sourdoughStarter;
    }
    @Override
    public void recipe() {
        System.out.println("Mix in sourdough starter in as well in first step.");
        super.recipe();
    }
    @Override
    public void getIngredients() {
        super.getIngredients();
        System.out.println(sourdoughStarter + " cup(s) of sourdough starter");
    }
}
