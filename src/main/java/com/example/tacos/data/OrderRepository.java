package com.example.tacos.data;

import com.example.tacos.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);
}
