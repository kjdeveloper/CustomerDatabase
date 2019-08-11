package pl.jankowiak.testform.validation;

import pl.jankowiak.testform.dto.ClientDto;
import pl.jankowiak.testform.exceptions.ExceptionCode;
import pl.jankowiak.testform.exceptions.MyException;

import java.time.LocalDate;
import java.util.Map;

public class ClientValidator implements IValidator<ClientDto> {

    @Override
    public Map<String, String> validate(ClientDto clientDto) {
        if (clientDto == null){
            throw new MyException(ExceptionCode.CLIENT_IS_NULL, "CLIENT CAN NOT BE NULL");
        }

        if (!isNameValid(clientDto.getName())){
            errors.put("NAME", "client name is not valid " + clientDto.getName());
        }
        if (!isSurnameValid(clientDto.getSurname())){
            errors.put("SURNAME", "client surname is not valid " + clientDto.getSurname());
        }
        if (!isDateBirthValid(clientDto.getDateOfBirth())){
            errors.put("DATE OF BIRTH", "client birth of date is not valid " + clientDto.getDateOfBirth());
        }
        if (!isEmailValid(clientDto.getEmail())){
            errors.put("EMAIL", "Client email is not valid " + clientDto.getEmail());
        }
        if (!isPhoneNumberValid(clientDto.getPhoneNumber())){
            errors.put("PHONE NUMBER", "Client phone number is not valid");
        }
        if (!isEstimatedRentalDateValid(clientDto.getEstimatedRentalDate())){
            errors.put("ESTIMATED RENTAL DATE", "Client estimated rental date is not valid " + clientDto.getEstimatedRentalDate());
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
