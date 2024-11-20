// Real subject: Connects to the actual database and executes queries
public class RealDatabase implements Database {
    public RealDatabase() {
        // Simulate expensive database connection setup
        System.out.println("Connecting to the real database...");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing query on the real database: " + query);
    }
}
