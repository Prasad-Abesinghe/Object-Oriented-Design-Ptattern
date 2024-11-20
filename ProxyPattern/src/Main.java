// Main class to demonstrate the Proxy Pattern
public class Main {
    public static void main(String[] args) {
        // Create a proxy with valid credentials
        Database dbProxyValid = new DatabaseProxy("admin", "password123");
        dbProxyValid.executeQuery("SELECT * FROM users");

        // Create a proxy with invalid credentials
        Database dbProxyInvalid = new DatabaseProxy("user", "wrongpassword");
        dbProxyInvalid.executeQuery("SELECT * FROM orders");
    }
}
