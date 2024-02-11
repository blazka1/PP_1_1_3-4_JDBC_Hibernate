package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Random1", "Randomov1", (byte) 11);
        userService.saveUser("Random2", "Randomov2", (byte) 22);
        userService.saveUser("Random3", "Randomov3", (byte) 33);
        userService.saveUser("Random4", "Randomov4", (byte) 44);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
        Util.getSessionFactory().close();
}
}
