package com.blogspot.przybyszd.guicetutorial.simplestinjection;

import javax.inject.Inject;

/**
 * Created by alien on 15.03.14.
 */
public class PersonController {

    private final PersonValidator userValidator;
    private final PersonDao userDao;

    @Inject
    public PersonController(final PersonValidator userValidator, final PersonDao userDao){
        this.userValidator = userValidator;
        this.userDao = userDao;
    }

    public void add(final Person user) throws PersonValidationException{
        userValidator.validate(user);
        userDao.persist(user);
    }
}
