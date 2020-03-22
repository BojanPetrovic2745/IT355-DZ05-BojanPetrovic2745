package met.local.controller;

import met.local.service.AutomobilService;
import java.util.List;
import met.local.domain.Automobil;
import met.local.domain.AutomobilValidator;
import met.local.domain.Klasa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping("/automobilForm")
@SessionAttributes("automobil")
public class AutomobilFormController {

    private final AutomobilService automobilService;
    private final AutomobilValidator automobilValidator;

    @Autowired
    public AutomobilFormController(AutomobilService automobilService,
            AutomobilValidator automobilValidator) {

        this.automobilService = automobilService;
        this.automobilValidator = automobilValidator;

    }

    @ModelAttribute("klasa")
    public List<Klasa> populateSportTypes() {
        return automobilService.getAllKlasa();
    }

    @RequestMapping(method = RequestMethod.GET)
    public String setupForm(
            @RequestParam(required = false, value = "naziv") String username,
            Model model) {

        Automobil automobil = new Automobil();
        automobil.setNaziv(username);
        model.addAttribute("automobil", automobil);
        return "automobilForm";

    }

    @RequestMapping(method = RequestMethod.POST)
    public String submitForm(
            @ModelAttribute("automobil") @Validated Automobil automobil,
            BindingResult result, SessionStatus status) {
        if (result.hasErrors()) {
            return "automobilForm";
        } else {
            automobilService.make(automobil);
            return "automobilSuccess";
        }
    }

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setValidator(automobilValidator);

    }
}
