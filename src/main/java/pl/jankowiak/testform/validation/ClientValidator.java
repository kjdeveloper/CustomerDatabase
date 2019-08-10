package pl.jankowiak.testform.validation;

import pl.jankowiak.testform.dto.ClientDto;

import java.time.LocalDate;
import java.util.Map;

public class ClientValidator implements IValidator<ClientDto> {

    @Override
    public Map<String, String> validate(ClientDto clientDto) {
        if (clientDto == null){
            errors.put("null", "Client is null");
        }






        return errors;
    }

    @Override
    public boolean hasErrors() {
        return !errors.isEmpty();
    }

    private boolean isNameValid(String name){
        return name.matches("[A-Z][a-z]+");
    }

    private boolean isSurnameValid(String surname){
        return surname.matches("([A-Z][a-z]+[-]?)+");
    }

    private boolean isDateBirthValid(LocalDate localDate){
        return localDate.isBefore(LocalDate.now().minusYears(18));
    }

    private boolean isEmailValid(String email){
        return email.matches("^[\\w-_.+]*[\\w-_.]@([\\w]+\\.)+[\\w]+[\\w]$");
    }

    private boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.matches("\\+\\d{2}( \\d{3}){3}");
    }

    private boolean isEstimatedRentalDateValid(LocalDate estimateRentalDate){
        return estimateRentalDate.isAfter(LocalDate.now().plusDays(1));
    }


}
