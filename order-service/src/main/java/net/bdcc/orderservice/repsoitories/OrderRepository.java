package net.bdcc.orderservice.repsoitories;

import net.bdcc.orderservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}
