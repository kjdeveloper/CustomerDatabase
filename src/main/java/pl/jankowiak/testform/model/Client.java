package pl.jankowiak.testform.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

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
    private int age;
    private String email;
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    private Vehicle vehicle;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime estimatedRentalDate;

    @Enumerated(EnumType.STRING)
    private EstimatedRentalTime estimatedRentalTime;


}
