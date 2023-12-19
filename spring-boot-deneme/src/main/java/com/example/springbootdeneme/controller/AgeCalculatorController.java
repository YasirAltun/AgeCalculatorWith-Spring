package com.example.springbootdeneme.controller;

import com.example.springbootdeneme.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.Period;

@Controller
public class AgeCalculatorController {

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("person", new Person());
        return "form";
    }

    @PostMapping("/calculate")
    public String calculateAge(@RequestParam("birthDate") LocalDate birthDate, Model model) {
        Person person = new Person();
        person.setBirthDate(birthDate);
        Period age = Period.between(birthDate, LocalDate.now());
        model.addAttribute("years", age.getYears());
        model.addAttribute("months", age.getMonths());
        model.addAttribute("days", age.getDays());
        return "result";
    }
}
