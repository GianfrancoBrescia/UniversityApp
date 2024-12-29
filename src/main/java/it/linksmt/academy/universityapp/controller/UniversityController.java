package it.linksmt.academy.universityapp.controller;

import it.linksmt.academy.universityapp.model.Aula;
import it.linksmt.academy.universityapp.model.User;
import it.linksmt.academy.universityapp.service.AulaService;
import it.linksmt.academy.universityapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class UniversityController {

    private final AulaService aulaService;
    private final UserService userService;

    @GetMapping("/registra-aula")
    public String registraAula(Model model) {
        model.addAttribute("aula", new Aula());
        return "registraAula";
    }

    @GetMapping("/registra-utente")
    public String registraUtente(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("aule", aulaService.recuperaTutto());
        return "registraUtente";
    }

    @GetMapping("/aule")
    public String visualizzaAule(Model model) {
        model.addAttribute("aule", aulaService.recuperaTutto());
        return "visualizzaAule";
    }

    @GetMapping("/utenti-aule")
    public String visualizzaUtentiAule(Model model) {
        model.addAttribute("users", userService.recuperaTutto());
        return "visualizzaUtentiAule";
    }

    @PostMapping("/registra-aula")
    public String registraAula(@ModelAttribute @Valid Aula aula, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) return "registraAula";

        aulaService.salvaAula(aula);
        return "successPage";
    }

    @PostMapping("/registra-utente")
    public String registraUtente(@ModelAttribute @Valid User user, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) return "registraUtente";

        it.linksmt.academy.universityapp.entity.Aula aula = aulaService.recuperaAula(user.getIdAula());
        userService.salvaStudente(user, aula);
        return "successPage";
    }
}
