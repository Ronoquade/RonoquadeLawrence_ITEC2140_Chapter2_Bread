public class Bread {
    /**Class: Bread
     * @author Ronoquade Lawrence
     * @version 1.0
     * Course: ITEC 2140 Spring 2024
     * Written: February 20, 2024
     *
     * This class provide the basic ingredients for breads and has the recipe
     * and getIngredients method.
     */
    private double flour;
    private double water;
    private double salt;
    private double sugar;
    private double bakingPowder;
    private double yeast;
    private String breadName;
    boolean state;
    // Default Constructor
    public Bread() {
        flour = 5.0;
        water = 1.5;
        salt = 2.5;
        sugar = 2.0;
        bakingPowder = 2.0;
        yeast = 1.0;
        breadName = "Bread";
        state = false;
    }

    public Bread(double flour, double water, double salt, double sugar, double bakingPowder, double yeast, String breadName, boolean state) {
        this.flour = flour;
        this.water = water;
        this.salt = salt;
        this.sugar = sugar;
        this.bakingPowder = bakingPowder;
        this.yeast = yeast;
        this.breadName = breadName;
        this.state = state;
    }
    // Getters and Setters for instance variables
    public double getFlour() {
        return flour;
    }

    public void setFlour(double flour) {
        this.flour = flour;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public double getSalt() {
        return salt;
    }

    public void setSalt(double salt) {
        this.salt = salt;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getBakingPowder() {
        return bakingPowder;
    }

    public void setBakingPowder(double bakingPowder) {
        this.bakingPowder = bakingPowder;
    }
    public double getYeast() {
        return yeast;
    }
    public void setYeast(double yeast) {
        this.yeast = yeast;
    }

    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    public String toString() {
        return breadName + ":\nState of Bread: " + state;
    }

    public void getIngredients() {
        System.out.println("Ingredients of " + breadName + " are:");
        System.out.println(flour + " cups of flour");
        System.out.println(water + " cups of water");
        System.out.println(salt + " tsps of salt");
        System.out.println(sugar + " tsps of sugar");
        System.out.println(bakingPowder + " cups of flour");
        System.out.println(yeast + " tsps of yeast");
    }
    public void recipe() {
        System.out.println("The recipe:");
        System.out.println("1. Mix flour, water, salt, sugar, baking powder, and yeast.");
        System.out.println("2. Make the dough.");
        System.out.println("3. Bulk Rise");
        System.out.println("4. Stretch and fold the dough");
        System.out.println("5. Cut and shape the dough");
        System.out.println("6. Second rise");
        System.out.println("7. Preheat the oven to 450°F towards the tail end of the second rise.");
        System.out.println("8. Spray the loaf with luke warm water.");
        System.out.println("9. Bake the bread at 400°F for 20 minutes, until deep golden brown.");
        System.out.println("10. Remove the bread from the oven.");
        System.out.println("11. Let the bread cool until good to eat.");
    }
    public void bake() {
        if (state == false) {
            state = true;
            System.out.println("Baking " + breadName + "...");
        }
        else if (state == true) {
            System.out.println("Can't bake, " + breadName + " is already baked.");
        }
        System.out.println("The " + breadName + " is baked now.");
    }
}