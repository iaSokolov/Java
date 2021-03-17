package vtb.geekbrains.models;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

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

    @ManyToOne
    @JoinColumn(name = "customer_id", insertable = false, updatable = false)
    Customer customer;

    @ManyToOne
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    Product product;

    @Column(name = "amount")
    private BigDecimal amount;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        if (this.id == null) {
            this.id = new Id();
        }
        this.id.customer_id = customer.getId();
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        if (this.id == null) {
            this.id = new Id();
        }
        this.id.product_id = product.getId();
        this.product = product;
    }
}