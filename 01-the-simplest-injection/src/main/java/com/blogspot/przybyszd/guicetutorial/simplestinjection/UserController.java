package com.blogspot.przybyszd.guicetutorial.simplestinjection;

import javax.inject.Inject;

/**
 * Created by alien on 15.03.14.
 */
public class UserController {

    private final UserValidator userValidator;
    private final UserDao userDao;

    @Inject
    public UserController(final UserValidator userValidator, final UserDao userDao){
        this.userValidator = userValidator;
        this.userDao = userDao;
    }

    public void add(final User user) throws UserValidationException{
        userValidator.validate(user);
        userDao.persist(user);
    }
}
