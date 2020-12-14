package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public User show(Long id);

    public void update(Long id, User updateUser);

    public void save(User user);

    public void delete(Long id);

    public User getUserByName(String name);
}
