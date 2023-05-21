package com.devsuperior.frete.services;

import org.springframework.stereotype.Service;

import com.devsuperior.frete.entities.Order;

@Service
public class ShippingService {

    public double shipment(Order order) {
        if (order.getBasic() < 100.0) {
            return order.getBasic() - order.getBasic() * order.getDiscount()/100 + 20.0;
        }
        if (order.getBasic() > 100.0 && order.getBasic() < 200.0) {
            return order.getBasic() - order.getBasic() * order.getDiscount()/100 + 12.0;
        }
        return order.getBasic() - order.getBasic() * order.getDiscount()/100;
    }
    
}
