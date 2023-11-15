
import java.util.ArrayList;
        import java.util.List;

public class UserRepository {

    List<User> data = new ArrayList<>();

    public void addUser(User user) {
        data.add(user);
    }
    public void logoutNonAdminUsers() {
        for (User user : data) {
            if (!user.isAdmin) {
                user.isAuthenticate = false;

            }
        }
    }
}