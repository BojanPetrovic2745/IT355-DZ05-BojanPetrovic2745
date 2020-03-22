package met.local.controller;

import java.util.Collections;
import java.util.List;
import met.local.domain.Automobil;
import met.local.service.AutomobilService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/automobilQuery")
public class AutomobilQueryController {

    private final AutomobilService automobilService;

    public AutomobilQueryController(AutomobilService automobilService) {
        this.automobilService = automobilService;
    }

    @GetMapping
    public void setupForm() {

    }

    @PostMapping
    public String submitForm(@RequestParam("naziv") String naziv,
            Model model) {

        List<Automobil> automobili = Collections.emptyList();

        if (naziv != null) {
            automobili = automobilService.query(naziv);
        }

        model.addAttribute("automobil", automobili);
        return "automobilQuery";
    }

}
