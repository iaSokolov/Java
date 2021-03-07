package vtb.geekbrains.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Getter
@Setter
public class SearchProduct {
    private BigDecimal minCost;
    private BigDecimal maxCost;
    private String title;

    public SearchProduct() {
    }
}
