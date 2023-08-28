package ru.netology.repository;

import org.springframework.stereotype.Repository;
import ru.netology.model.Authorities;
import ru.netology.model.User;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserRepository {
    private ConcurrentHashMap<User, List<Authorities>> userMap;

    public UserRepository() {
        this.userMap = new ConcurrentHashMap<>();
        userMap.put(new User("admin", "1234"), List.of(Authorities.READ, Authorities.WRITE, Authorities.DELETE));
        userMap.put(new User("user1", "1111"), List.of(Authorities.READ, Authorities.WRITE));
        userMap.put(new User("ban", "0000"), List.of());
    }

    public List<Authorities> getUserAuthorities(String user, String password) {
        User u = new User(user, password);
        return userMap.get(u);
    }
}
