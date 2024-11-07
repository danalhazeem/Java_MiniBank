package Bank;
import java.util.ArrayList;
import java.util.List;

public class BankSingleton {
    private static BankSingleton instance;
    private List<User> users;
    private BankAccount account;

    private BankSingleton() {
        users = new ArrayList<>();
    }

    public static BankSingleton getInstance() {
        if (instance == null) {
            instance = new BankSingleton();
        }
        return instance;
    }

    public static void setInstance(BankSingleton instance) {
        BankSingleton.instance = instance;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


    public User createUser(String username, String password) {
        for (User user :users){
            if (user.getUsername().equals(username)){
                throw new IllegalArgumentException("Username " + username + " already exists. Please choose a different one.");

            }
        }
        User newUser = new User(username,password);
        users.add(newUser);
        System.out.println("User " + username + " created successfully.");
        return newUser;

    }

    public User authenticate(String username, String password){
        for (User user :users){
            if (user.getUsername().equals(username) && user.getPassword().equals(password)){
                return user;
            }else {
                System.out.println("User not found"+username);
            }
        }
        return null;
    }

}
