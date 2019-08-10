package pl.jankowiak.testform.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.jankowiak.testform.repository.ClientRepository;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepository;

}
