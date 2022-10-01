package com.example.tacos.data;

import com.example.tacos.TacoOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface OrderRepository
        extends CrudRepository<TacoOrder, UUID> {

}
