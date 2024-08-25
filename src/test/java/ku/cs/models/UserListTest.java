package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("aaa", "11111");
        userList.addUser("bbb", "22222");
        userList.addUser("ccc", "33333");

        // TODO: find one of them
        User user = new User("aaa");

        // TODO: assert that UserList found User
         String expected = "aaa";
         String actual = user.getUsername();
         assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("aaa", "11111");
        userList.addUser("bbb", "22222");
        userList.addUser("ccc", "33333");
        // TODO: change password of one user
        boolean actual = userList.changePassword("bbb", "22222", "99999");

        // TODO: assert that user can change password
         assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("aaa", "11111");
        userList.addUser("bbb", "22222");
        userList.addUser("ccc", "33333");
        // TODO: call login() with correct username and password
        User actual = userList.login("aaa", "33333");
        // TODO: assert that User object is found
        User expected = userList.findUserByUsername("aaa");
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("aaa", "11111");
        userList.addUser("bbb", "22222");
        userList.addUser("ccc", "33333");
        // TODO: call login() with incorrect username or incorrect password
        User actual = userList.login("aaa", "11111");
        // TODO: assert that the method return null
        assertNull(actual);
    }

}