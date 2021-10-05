package co.com.sofka.petproject.domain.stock.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.petproject.domain.stock.value.ProductId;

public class ProductDeleted extends DomainEvent {
    private final ProductId productId;

    public ProductDeleted(ProductId productId) {
        super("co.com.sofka.petproject.stock.productdeleted");
        this.productId = productId;
    }

    public ProductId getProductId() {
        return productId;
    }
}
