package com.medplus.Prototype;

import com.medplus.Observer.Order;

public class StorePickUp extends StoreDeliveryType {

    public StorePickUp(int deliveryId, String deliveryType, double deliveryCost, Order order) {
        super(deliveryId, deliveryType, deliveryCost, order);
        // TODO Auto-generated constructor stub
    }

    @Override
    public StorePickUp clone() {
        return new StorePickUp(this.getDeliveryId(), this.getDeliveryType(), this.getDeliveryCost(), this.getOrder());
    }
    @Override
    String delivertDescription() {
        // TODO Auto-generated method stub
        return "You need to pickup your oder from the Store";
    }

    @Override
    public String toString() {
        return new StringBuilder().append("Delivery Type: ")
                .append(getDeliveryType()).append("\t Delivery Cost: ")
                .append(getDeliveryCost()).append("For Order: ")
                .append(getOrder().toString()).toString();
    }
}