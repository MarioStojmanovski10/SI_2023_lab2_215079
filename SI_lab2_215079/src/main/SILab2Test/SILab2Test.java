import org.junit.Test;
import static org.junit.Assert.*;

public class SILab2Test {

    @Test(expected = RuntimeException.class)
    public void testFunction_NullUser_ThrowsException() {
        // Arrange
        User user = null;
        List<User> allUsers = new ArrayList<>();

        // Act
        SILab2.function(user, allUsers);

        // Assert
        // Очекуваме да се фрли исклучок од тип RuntimeException
    }

    @Test
    public void testFunction_NullUsername_SetsEmailAsUsername() {
        // Arrange
        User user = new User(null, "Password123", "user@example.com");
        List<User> allUsers = new ArrayList<>();

        // Act
        SILab2.function(user, allUsers);

        // Assert
        assertEquals(user.getEmail(), user.getUsername());
    }

    @Test
    public void testFunction_PasswordWithWhitespace_ReturnsFalse() {
        // Arrange
        User user = new User("john", "Password 123", "john@example.com");
        List<User> allUsers = new ArrayList<>();

        // Act
        boolean result = SILab2.function(user, allUsers);

        // Assert
        assertFalse(result);
    }

    @Test
    public void testFunction_ValidInput_ReturnsTrue() {
        // Arrange
        User user = new User("john", "Password123", "john@example.com");
        List<User> allUsers = new ArrayList<>();

        // Act
        boolean result = SILab2.function(user, allUsers);

        // Assert
        assertTrue(result);
    }
}
