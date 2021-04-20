package vtb.geekbrains.market.product.sales.controllers;

import org.springframework.web.bind.annotation.*;
import vtb.geekbrains.market.product.sales.models.Sales;
import vtb.geekbrains.market.product.sales.services.SalesService;

import java.util.List;

@RestController
public class SalesController {
    final
    SalesService salesService;

    public SalesController(SalesService salesService) {

        this.salesService = salesService;
    }

    @GetMapping("/sales")
    public List<Sales> getSalesSet() {

        return this.salesService.getEntitySet();
    }

    @GetMapping("/sale")
    public Sales getSalesEntity(Sales.Id salesId) {

        return this.salesService.getEntity(salesId);
    }

    @PostMapping("/sale")
    public void createSalesEntity(@RequestBody Sales sales) {

        this.salesService.createEntity(sales);
    }

    @DeleteMapping("/sale")
    public void deleteSalesEntity(@RequestBody Sales sales) {

        this.salesService.deleteEntity(sales);
    }
}