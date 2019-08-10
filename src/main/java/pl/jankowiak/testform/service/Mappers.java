package pl.jankowiak.testform.service;

import pl.jankowiak.testform.dto.ClientDto;
import pl.jankowiak.testform.model.Client;

public interface Mappers {

    static Client fromClientDtoToClient(ClientDto clientDto){
        return clientDto == null ? null : Client.builder()
                .id(clientDto.getId())
                .name(clientDto.getName())
                .surname(clientDto.getSurname())
                .dateOfBirth(clientDto.getDateOfBirth())
                .email(clientDto.getEmail())
                .phoneNumber(clientDto.getPhoneNumber())
                .gender(clientDto.getGender())
                .vehicle(clientDto.getVehicle())
                .estimatedRentalDate(clientDto.getEstimatedRentalDate())
                .estimatedRentalTime(clientDto.getEstimatedRentalTime())
                .build();
    }

    static ClientDto fromClientToClientDto(Client client){
        return client == null ? null : ClientDto.builder()
                .id(client.getId())
                .name(client.getName())
                .surname(client.getSurname())
                .dateOfBirth(client.getDateOfBirth())
                .email(client.getEmail())
                .phoneNumber(client.getPhoneNumber())
                .gender(client.getGender())
                .vehicle(client.getVehicle())
                .estimatedRentalDate(client.getEstimatedRentalDate())
                .estimatedRentalTime(client.getEstimatedRentalTime())
                .build();
    }

}
