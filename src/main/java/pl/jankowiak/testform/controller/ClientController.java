package pl.jankowiak.testform.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.jankowiak.testform.dto.ClientDto;
import pl.jankowiak.testform.model.EstimatedRentalTime;
import pl.jankowiak.testform.model.Gender;
import pl.jankowiak.testform.model.Vehicle;
import pl.jankowiak.testform.service.ClientService;

@Controller
@RequestMapping("/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping("/create")
    public String createGet(Model model) {
        model.addAttribute("client", new ClientDto());
        model.addAttribute("genders", Gender.values());
        model.addAttribute("vehicles", Vehicle.values());
        model.addAttribute("estimateRentalTimes", EstimatedRentalTime.values());
        return "clients/create";
    }

    @PostMapping("/create")
    public String createPost(@ModelAttribute ClientDto clientDto) {
        System.out.println(clientDto);
        return "redirect:/";
    }


}
