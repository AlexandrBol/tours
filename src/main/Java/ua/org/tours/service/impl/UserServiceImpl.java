package ua.org.tours.service.impl;

import ua.org.tours.DAO.DAOFactory;
import ua.org.tours.DAO.api.DAO;
import ua.org.tours.mapper.BeanMapper;
import ua.org.tours.model.User;
import ua.org.tours.service.api.Service;

import java.util.List;

public class UserServiceImpl implements Service<Integer, User> {

    private static UserServiceImpl service;
    private DAO<Integer, User> userDAO;
    private BeanMapper beanMapper;

    private UserServiceImpl() {
        userDAO = DAOFactory.getInstance().getUserDAO();
        beanMapper = BeanMapper.getInstance();
    }

    public static synchronized UserServiceImpl getInstance() {
        if (service == null) {
            service = new UserServiceImpl();
        }
        return service;
    }

    @Override
    public List<User> getAll() {
        List<User> users = userDAO.getAll();
        List<User> userDTOs = beanMapper.listMapToList(users, User.class);
        return userDTOs;
    }

    @Override
    public User getById(Integer id) {
        User user = userDAO.getById(id);
        User userDTO = beanMapper.singleMapper(user, User.class);
        return userDTO;
    }

    @Override
    public void save(User user) {
        user = beanMapper.singleMapper(user, User.class);
        userDAO.save(user);
    }

    public User UserGetByEmail(String value){
        User user = userDAO.getBy("email", value);
        User userDTO = beanMapper.singleMapper(user, User.class);
        return userDTO;
    }


    @Override
    public void delete(Integer key) {

    }

    @Override
    public void update(User user) {
        user = beanMapper.singleMapper(user, User.class);
        userDAO.save(user);
    }
}
