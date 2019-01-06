package ru.demon.electricbrain.observer;


/**
 * Created by Alex Vedensky
 * avedensky@gmail.com
 * DATE: 13.06.17
 */

public interface Purchasers { //Observable
    void registrPurchaser(Purchaser purchaser);
    void removePurchaser(Purchaser purchaser);
    void notifyPurchaser();
}
