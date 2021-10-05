package co.com.sofka.petproject.domain.customer.command;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.petproject.domain.customer.value.CustomerId;
import co.com.sofka.petproject.domain.stock.value.Name;

public class ChangeName extends Command {
    private final CustomerId customerId;
    private final Name name;

    public ChangeName(CustomerId customerId, Name name) {
        this.customerId = customerId;
        this.name = name;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public Name getName() {
        return name;
    }
}
