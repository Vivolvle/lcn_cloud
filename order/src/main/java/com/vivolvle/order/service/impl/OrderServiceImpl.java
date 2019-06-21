package com.vivolvle.order.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.vivolvle.order.entity.TbOrders;
import com.vivolvle.order.repositories.OrderRepository;
import com.vivolvle.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author weilz
 * @date 2019/6/21
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Override
    @Transactional
    @TxTransaction
    public void addOrder(TbOrders tbOrders) {
        orderRepository.save(tbOrders);
    }
}
