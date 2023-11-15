
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserRepositoryTest {

        @Test
        void testLogoutNonAdminUsers() {
            UserRepository userRepository = new UserRepository();

            User adminUser = new User("Admin", "admin123", true);
            User nonAdminUser1 = new User("User1", "password123", false);
            User nonAdminUser2 = new User("User2", "password456", false);

            userRepository.addUser(adminUser);
            userRepository.addUser(nonAdminUser1);
            userRepository.addUser(nonAdminUser2);

            adminUser.isAuthenticate = true;
            nonAdminUser1.isAuthenticate = true;
            nonAdminUser2.isAuthenticate = true;

            userRepository.logoutNonAdminUsers();

            assertFalse(nonAdminUser1.isAuthenticate);
            assertFalse(nonAdminUser2.isAuthenticate);
            assertTrue(adminUser.isAuthenticate);
        }
    }

