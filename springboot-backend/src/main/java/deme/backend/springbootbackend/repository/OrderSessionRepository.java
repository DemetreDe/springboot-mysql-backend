package deme.backend.springbootbackend.repository;

import deme.backend.springbootbackend.model.OrderSession;
import org.hibernate.criterion.Order;
import org.springframework.data.jpa.repository.JpaRepository;

//Communicates with DB
public interface OrderSessionRepository extends JpaRepository<OrderSession, Integer> {
}
