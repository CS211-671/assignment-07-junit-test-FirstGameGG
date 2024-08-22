package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User u1;

    @BeforeEach
    void init(){
        u1 = new User("thitichotK");
    }
    @Test
    @DisplayName("Password should not store in plain text")
    public void testPasswordIsNotStoreInPlainText() {
        User user = new User("user01", "plain-p@ssw0rd");
        String actual = user.getPassword();
        String unexpected = "plain-p@ssw0rd";
        assertNotEquals(unexpected, actual);
    }

    @Test
    @DisplayName("Password should be verified by plain text")
    public void testPasswordShouldBeVerified() {
        User user = new User("user01", "plain-p@ssw0rd");
        boolean actual = user.validatePassword("plain-p@ssw0rd");
        assertTrue(actual);
    }

    @Test
    public void testIsUsername(){
        assertEquals("thitichotK", u1.getUsername());
        assertNotEquals("user01", u1.getUsername());
    }

    @Test
    public void testSetPassword() {
        u1.setPassword("plain-p@ssw0rd");
        String actual = u1.getPassword();
        String unexpected = "fake-p@ssw0rd";
        assertNotEquals(unexpected, actual);
    }

    @Test
    public void testValidatePassword() {
        u1.setPassword("plain-p@ssw0rd");
        boolean actual = u1.validatePassword("plain-p@ssw0rd");
        assertTrue(actual);

        boolean fake = u1.validatePassword("fake-p@ssw0rd");
        assertFalse(fake);
    }
}