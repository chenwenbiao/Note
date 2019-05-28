package org.java.core.advanced.DesignPatterns.creational.factory.GoodDemo.AbstractFactory;

import org.java.core.advanced.DesignPatterns.creational.factory.GoodDemo.DatabaseRepository;
import org.java.core.advanced.DesignPatterns.creational.factory.GoodDemo.Repository;

public class DatabaseRepositoryFactory implements RepositoryFactoryProvider{
    @Override
    public Repository create() {
        return new DatabaseRepository();
    }
}