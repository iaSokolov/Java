package vtb.geekbrains.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vtb.geekbrains.models.Sale;
import vtb.geekbrains.repositories.SaleRepo;

import java.util.List;

@Service
public class SaleService {
    @Autowired
    SaleRepo saleRepo;

    public List<Sale> getAll() {
        return this.saleRepo.findAll();
    }
}