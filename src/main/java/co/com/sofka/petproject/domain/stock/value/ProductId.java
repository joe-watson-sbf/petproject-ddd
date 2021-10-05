package co.com.sofka.petproject.domain.stock.value;

import co.com.sofka.domain.generic.Identity;

public class ProductId extends Identity {
    public ProductId(String id){
        super(id);
    }
    public ProductId of(String id){
        return new ProductId(id);
    }
}
