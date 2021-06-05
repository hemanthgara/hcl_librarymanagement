package com.library.demo.data.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.lms.demo.data.model.Order;
import org.springframework.stereotype.Repository;

public interface OrderRepository extends CrudRepository<Order, Long> {

    @Modifying
    @Transactional

}
