package met.local.domain;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class AutomobilValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Automobil.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "naziv",
                "required.naziv", "Naziv is required");

        ValidationUtils.rejectIfEmpty(errors, "NazivModela",
                "required.nazivModela", "Naziv modela is required");
        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "godiste",
                "required.godiste", "Godiste is required");
        
        ValidationUtils.rejectIfEmpty(errors, "klasa", 
                "required.klasa", "Klasa is required");
                

        
    }

}
