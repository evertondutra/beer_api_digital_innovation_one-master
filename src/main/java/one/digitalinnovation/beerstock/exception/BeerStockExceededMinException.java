package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerStockExceededMinException extends Exception {

    public BeerStockExceededMinException(Long id, int quantityToIncrement) {
        super(String.format("Beers with %s ID to decrement informed exceeds the min stock capacity: %s", id, 0));
    }

}
