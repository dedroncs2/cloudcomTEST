package services;
import dao.dao;
import models.table;

import java.util.List;

public class TableServices {
    private dao usersDao = new dao();

    public TableServices() {
    }

    public table findUser(String id) {
        return usersDao.findByssoid(id);
    }

    public void saveUser(table user) {
        usersDao.save(user);
    }

    public void deleteUser(table user) {
        usersDao.delete(user);
    }

    public void updateUser(table user) {
        usersDao.update(user);
    }

    public List<table> findAllUsers() {
        return usersDao.findAll();
    }

    public List<table> findAllActive() {
        return usersDao.findAllActive();
    }

    public List<table> findUsedFroms() {
        return usersDao.findUsedForms();
    }

    public List<Object[]> findForms() {
        return usersDao.findFroms();
    }



}
