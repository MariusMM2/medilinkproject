package com.exam.medilink.repositories;

import com.exam.medilink.models.User;

import java.util.ArrayList;

public class UsersRepository extends AbstractCrudRepository<User> {
    @Override
    public int create(User item) {
        return 0;
    }

    @Override
    public ArrayList<User> readAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public User read(int id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void update(User item) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException();
    }
}
