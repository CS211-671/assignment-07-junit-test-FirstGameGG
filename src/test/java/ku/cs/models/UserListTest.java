package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList ul = new UserList();
        ul.addUser("user01", "0001");
        ul.addUser("user02", "0002");
        ul.addUser("user03", "0003");

        // TODO: find one of them
        User user = ul.findUserByUsername("user01");

        // TODO: assert that UserList found User
        String expected = "user01";
        String actual = user.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList ul = new UserList();
        ul.addUser("user01", "0001");
        ul.addUser("user02", "0002");
        ul.addUser("user03", "0003");

        // TODO: change password of one user
        boolean actual = ul.changePassword("user02", "0002", "2222");
        // TODO: assert that user can change password
        assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList ul = new UserList();
        ul.addUser("user01", "0001");
        ul.addUser("user02", "0002");
        ul.addUser("user03", "0003");
        // TODO: call login() with correct username and password
        User expected = ul.findUserByUsername("user03");
        User actual = ul.login("user03", "0003");
        // TODO: assert that User object is found
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList ul = new UserList();
        ul.addUser("user01", "0001");
        ul.addUser("user02", "0002");
        ul.addUser("user03", "0003");

        // TODO: call login() with incorrect username or incorrect password
        User actual = ul.login("user03", "0004");

        // TODO: assert that the method return null
        assertNull(actual);
    }

}