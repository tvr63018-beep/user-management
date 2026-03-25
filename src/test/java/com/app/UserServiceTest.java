package com.app;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    UserService service;

    @BeforeEach
    void setup() {
        service = new UserService();
    }

    @Test
    void testAddUser() {
        service.addUser(new User(1, "John"));
        assertEquals(1, service.getUserCount());
    }

    @Test
    void testUpdateUser() {
        service.addUser(new User(1, "John"));
        service.updateUser(1, "Mike");
        assertEquals("Mike", service.getUser(1).getName());
    }

    @Test
    void testDeleteUser() {
        service.addUser(new User(1, "John"));
        service.deleteUser(1);
        assertEquals(0, service.getUserCount());
    }
}
