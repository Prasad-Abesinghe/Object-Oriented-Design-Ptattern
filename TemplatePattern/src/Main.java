// Main class to demonstrate the Template Method Pattern
public class Main {
    public static void main(String[] args) {
        // Prepare tea
        Beverage tea = new Tea();
        System.out.println("Making tea:");
        tea.prepareRecipe();

        System.out.println();

        // Prepare coffee
        Beverage coffee = new Coffee();
        System.out.println("Making coffee:");
        coffee.prepareRecipe();
    }
}
