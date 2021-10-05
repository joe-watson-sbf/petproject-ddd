package co.com.sofka.petproject.domain.stock;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.petproject.domain.stock.entity.Product;
import co.com.sofka.petproject.domain.stock.event.ProductAdded;
import co.com.sofka.petproject.domain.stock.event.ProductDeleted;
import co.com.sofka.petproject.domain.stock.event.ProductUpdated;
import co.com.sofka.petproject.domain.stock.event.StockCreated;
import co.com.sofka.petproject.domain.stock.value.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Stock extends AggregateEvent<StockId> {
    protected Set<Product> products;
    protected Name name;

    public Stock(StockId stockId, Name name) {
        super(stockId);
        appendChange(new StockCreated(name)).apply();
    }

    private Stock(StockId stockId){
        super(stockId);
        subscribe(new StockChange(this));
    }

    public static Stock from(StockId stockId, List<DomainEvent> events){
        var stock = new Stock(stockId);
        events.forEach(stock::applyEvent);
        return stock;
    }

    public void addProduct(ProductId entityId, Name name, Quantity quantity, Description description){

        Objects.requireNonNull(entityId, "The product id cannot be null!!!");
        Objects.requireNonNull(name, "The product description cannot be null!!!");
        Objects.requireNonNull(quantity, "The product quantity cannot be null!!!");
        Objects.requireNonNull(description, "The product description cannot be null!!!");

        appendChange(new ProductAdded(entityId, name, quantity, description)).apply();
    }

    public void updateProduct(ProductId productId, Name name, Quantity quantity, Description description){

        Objects.requireNonNull(productId, "The product id cannot be null!!!");
        Objects.requireNonNull(name, "The product description cannot be null!!!");
        Objects.requireNonNull(quantity, "The product quantity cannot be null!!!");
        Objects.requireNonNull(description, "The product description cannot be null!!!");

        appendChange(new ProductUpdated(productId, name, quantity, description)).apply();
    }

    public void deleteProduct(ProductId productId){
        Objects.requireNonNull(productId, "The id product is required!!!");
        appendChange(new ProductDeleted(productId)).apply();
    }

    public Optional<Product> findProductById(ProductId productId) {
        return products.stream()
                .filter(product -> product.identity().equals(productId))
                .findFirst();
    }


    public Set<Product> products() {
        return products;
    }

    public void changeProducts(Set<Product> products) {
        this.products = products;
    }

    public Name name() {
        return name;
    }

    public void changeName(Name name) {
        this.name = name;
    }
}
