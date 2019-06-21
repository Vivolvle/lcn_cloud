package com.vivolvle.order.repositories;

import com.vivolvle.order.entity.TbOrders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * @author weilz
 * @date 2019/6/21
 */
@Component
public interface OrderRepository extends JpaRepository<TbOrders, Object> {
}
