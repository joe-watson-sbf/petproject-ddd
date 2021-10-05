package co.com.sofka.petproject.domain.stock.event;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.petproject.domain.stock.value.Description;
import co.com.sofka.petproject.domain.stock.value.Name;
import co.com.sofka.petproject.domain.stock.value.ProductId;
import co.com.sofka.petproject.domain.stock.value.Quantity;

public class ProductAdded extends DomainEvent {
    private final ProductId productId;
    private final Name name;
    private final Quantity quantity;
    private final Description description;


    public ProductAdded(ProductId productId, Name name, Quantity quantity, Description description) {
        super("co.com.sofka.petproject.stock.productadded");
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.description = description;
    }

    public ProductId getProductId() {
        return productId;
    }

    public Name getName() {
        return name;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public Description getDescription() {
        return description;
    }
}
