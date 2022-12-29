package org.example;

import org.example.model.dao.UsersDAO;
import org.example.model.entites.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UsersDAO usersDAO = new UsersDAO();

//        User addedUser = User.builder()
//                .name("Хулио")
//                .age(31)
//                .country("Мексика")
//                .build();
//
//        usersDAO.addNew(addedUser);

        User user = usersDAO.getById(8);
        System.out.println(user);

//        List<User> users = usersDAO.getAll();
//
//        for (User user:users) {
//            System.out.println(user);
//        }

//        User userId4 = usersDAO.getById(4);
//
//        User updadedUser = User.builder()
//                .id(4)
//                .name("Хуйло")
//                .age(userId4.getAge())
//                .country(userId4.getCountry())
//                .build();
//
//        usersDAO.updateById(updadedUser);

//        User deletedUser = User.builder()
//                .id(4)
//                .build();
//
//        usersDAO.deleteById(deletedUser);
    }
}
