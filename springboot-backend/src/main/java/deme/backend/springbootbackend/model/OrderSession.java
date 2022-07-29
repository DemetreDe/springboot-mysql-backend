package deme.backend.springbootbackend.model;

import lombok.Data;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

//Structure for entities in db
@Data
@Entity
@Table(name="orderSession")
public class OrderSession {

    @Id
    @Column(name="order_id")
    private int orderID;

    @Column(name = "shopify_order_number")
    private String shopifyOrderNum;


}
