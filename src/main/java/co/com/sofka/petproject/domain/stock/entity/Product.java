package co.com.sofka.petproject.domain.stock.entity;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.petproject.domain.stock.value.Description;
import co.com.sofka.petproject.domain.stock.value.Quantity;
import co.com.sofka.petproject.domain.stock.value.Name;
import co.com.sofka.petproject.domain.stock.value.ProductId;

public class Product extends Entity<ProductId> {
    private Name name;
    private Quantity quantity;
    private Description description;


    public Product(ProductId entityId, Name name, Quantity quantity, Description description) {
        super(entityId);
        this.name = name;
        this.quantity = quantity;
        this.description = description;
    }

    public Name name() {
        return name;
    }

    public void changeName(Name name) {
        this.name = name;
    }

    public Quantity imageUrl() {
        return quantity;
    }

    public void changeImageUrl(Quantity quantity) {
        this.quantity = quantity;
    }

    public Description description() {
        return description;
    }

    public void changeDescription(Description description) {
        this.description = description;
    }
}
