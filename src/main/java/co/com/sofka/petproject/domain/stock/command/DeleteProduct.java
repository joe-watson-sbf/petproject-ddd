package co.com.sofka.petproject.domain.stock.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.petproject.domain.stock.value.ProductId;

public class DeleteProduct extends Command {
    private final ProductId productId;

    public DeleteProduct(ProductId productId) {
        this.productId = productId;
    }

    public ProductId getProductId() {
        return productId;
    }
}
