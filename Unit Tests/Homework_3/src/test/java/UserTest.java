import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testAuthenticateWithCorrectCredentials() {
        User user = new User("JohnDoe", "password123", false);
        assertTrue(user.authenticate("JohnDoe", "password123"));
    }

    @Test
    void testAuthenticateWithIncorrectUsername() {
        User user = new User("JohnDoe", "password123", false);
        assertFalse(user.authenticate("JaneSmith", "password123"));
    }

    @Test
    void testAuthenticateWithIncorrectPassword() {
        User user = new User("JohnDoe", "password123", false);
        assertFalse(user.authenticate("JohnDoe", "pass123"));
    }
}