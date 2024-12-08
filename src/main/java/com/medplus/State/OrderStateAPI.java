package com.medplus.State;

public interface OrderStateAPI {
    public void orderConfirmed();
    public void orderDispatched();
    public void orderDelivered();
    public void closeOrder();
}
