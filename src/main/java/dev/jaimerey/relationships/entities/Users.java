package dev.jaimerey.relationships.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Optional;

record User(
        @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id,
        String uid,
        String name,
        Address address,
        boolean ceo) {
    public static final User DEFAULT_USER = new User(
            null,
            "0",
            "Dummy",
            null,
            false);
}
// A User Factory class to create User objects
public class Users {

    public static Optional<User> getUser(String uid) {

        User user = null;

        // logic to set user variable

        return Optional.ofNullable(user);
    }
}