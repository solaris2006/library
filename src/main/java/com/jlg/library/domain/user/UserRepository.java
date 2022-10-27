package com.jlg.library.domain.user;

import java.util.List;

public interface UserRepository {

    void save(final  User user);

    List<User> getAll();

    User getPassengerById(String userId);

    void delete(String userId);
}
