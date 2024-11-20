// Abstract class: Defines the template method and some abstract steps
public abstract class Beverage {
    // Template method: Defines the steps to prepare a beverage
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // Concrete step: Common to all beverages
    private void boilWater() {
        System.out.println("Boiling water...");
    }

    // Concrete step: Common to all beverages
    private void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    // Abstract steps: To be implemented by subclasses
    protected abstract void brew();          // Specific brewing step (e.g., steep tea or brew coffee)
    protected abstract void addCondiments(); // Add specific condiments (e.g., sugar, milk)
}
