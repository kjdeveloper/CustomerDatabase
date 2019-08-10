package pl.jankowiak.testform.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;
import pl.jankowiak.testform.model.EstimatedRentalTime;
import pl.jankowiak.testform.model.Gender;
import pl.jankowiak.testform.model.Vehicle;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientDto {
    private Long id;
    private String name;
    private String surname;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;
    private String email;
    private String phoneNumber;
    private Gender gender;
    private Vehicle vehicle;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate estimatedRentalDate;
    private EstimatedRentalTime estimatedRentalTime;

    private MultipartFile drivingLicenseScan;


}
