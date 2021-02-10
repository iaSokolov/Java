package vtb.geekbrains.market;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sales")
public class Order {
    @Embeddable
    public static class Id implements Serializable {
        @Column(name = "product_id")
        int product_id;

        @Column(name = "customer_id")
        int customer_id;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Order.Id id = (Order.Id) o;
            return product_id == id.product_id && customer_id == id.customer_id;
        }

        @Override
        public int hashCode() {
            return product_id + customer_id;
        }
    }

    @EmbeddedId
    Order.Id id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;

    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;
}
