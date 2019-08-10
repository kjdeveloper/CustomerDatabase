package pl.jankowiak.testform.validation;

import java.util.HashMap;
import java.util.Map;

public interface IValidator<T> {
    Map<String, String> errors = new HashMap<>();

    Map<String, String> validate(T t);
    boolean hasErrors();


}
