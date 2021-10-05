package co.com.sofka.petproject.domain.stock;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.petproject.domain.stock.event.ProductAdded;
import co.com.sofka.petproject.domain.stock.event.ProductDeleted;
import co.com.sofka.petproject.domain.stock.event.ProductUpdated;
import co.com.sofka.petproject.domain.stock.event.StockCreated;

import java.util.HashSet;

public class StockChange extends EventChange {
    public StockChange(Stock stock){
        apply((StockCreated event)->{
            stock.name = event.getName();
            stock.products = new HashSet<>();
        });

        apply((ProductAdded event)->{
            stock.addProduct(event.getProductId(), event.getName(), event.getQuantity(), event.getDescription());
        });

        apply((ProductUpdated event)->{
            stock.updateProduct(event.getProductId(), event.getName(), event.getQuantity(), event.getDescription());
        });

        apply((ProductDeleted event)->{
            stock.deleteProduct(event.getProductId());
        });
    }
}
