// Proxy class: Controls access to the RealDatabase
public class DatabaseProxy implements Database {
    private RealDatabase realDatabase;
    private String username;
    private String password;

    // Constructor accepts credentials
    public DatabaseProxy(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Authenticate before delegating to the real database
    private boolean authenticate() {
        // Simple authentication logic for demonstration
        return "admin".equals(username) && "password123".equals(password);
    }

    @Override
    public void executeQuery(String query) {
        if (authenticate()) {
            if (realDatabase == null) {
                realDatabase = new RealDatabase(); // Lazy initialization of RealDatabase
            }
            realDatabase.executeQuery(query); // Delegates to the real database
        } else {
            System.out.println("Authentication failed: Access denied.");
        }
    }
}
