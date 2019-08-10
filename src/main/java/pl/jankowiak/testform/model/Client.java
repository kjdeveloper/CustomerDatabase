package pl.jankowiak.testform.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private String email;
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private Vehicle vehicle;

    private LocalDate estimatedRentalDate;

    @Enumerated(EnumType.STRING)
    private EstimatedRentalTime estimatedRentalTime;


}
