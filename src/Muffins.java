public class Muffins extends Bread{
    /**Class: Muffins
     * @author Ronoquade Lawrence
     * @version 1.0
     * Course: ITEC 2140 Spring 2024
     * Written: February 20, 2024
     *
     * This class is a derivative of the bread class with muffin bread starter as a new instance variable.
     */
    private double muffinStarter;
    public Muffins(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, boolean state, double muffinStarter) {
        super(flour, water, salt, sugar, bakingPowder, yeast, breadName, state);
        this.muffinStarter = muffinStarter;
    }
    public Muffins() {
        super();
    }

    public double getMuffinStarter() {
        return muffinStarter;
    }

    public void setMuffinStarter(double muffinStarter) {
        this.muffinStarter = muffinStarter;
    }
    @Override
    public void recipe() {
        System.out.println("Mix in muffin starter in as well in first step.");
        super.recipe();
    }
    @Override
    public void getIngredients() {
        super.getIngredients();
        System.out.println(muffinStarter + " cup(s) of muffin starter");
    }
}
