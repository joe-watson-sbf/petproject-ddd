package co.com.sofka.petproject.domain.User.value;

import co.com.sofka.domain.generic.Identity;

public class UserId extends Identity {

    public UserId(){}

    public UserId(String id){
        super(id);
    }

    public static UserId of(String id){
        return new UserId(id);
    }
}
