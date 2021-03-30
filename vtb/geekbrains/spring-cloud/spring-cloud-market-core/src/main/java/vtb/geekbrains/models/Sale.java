package vtb.geekbrains.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Data
@Entity
@Table(name = "sales")
public class Sale {
    @Embeddable
    public static class Id implements Serializable {
        @Column(name = "product_id")
        Long product_id;

        @Column(name = "customer_id")
        Long customer_id;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Id id = (Id) o;
            return product_id == id.product_id && customer_id == id.customer_id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(product_id, customer_id);
        }
    }

    @EmbeddedId
    Sale.Id id;

    @Column(name = "amount")
    private BigDecimal amount;
}