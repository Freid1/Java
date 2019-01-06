package ru.demon.electricbrain.factory.abstract_factory;

/**
 * Created by alexey on 15.06.17.
 */
public interface FurnitureFactory { //AbstractFactory
    Furniture createChair();
    Furniture createTable();
}
