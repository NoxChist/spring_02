package ru.netology.model;

import java.util.Objects;

public class User {
    private String name;

    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name + password);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() == User.class) {
            User u = (User) obj;
            return name.equals(u.name) && password.equals(u.password);
        }
        return false;
    }
}
