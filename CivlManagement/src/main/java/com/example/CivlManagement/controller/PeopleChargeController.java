package com.example.CivlManagement.controller;

import com.example.CivlManagement.Service.ApplicationService;
import com.example.CivlManagement.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class PeopleChargeController {
    private final ApplicationService applicationService;

    public PeopleChargeController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }
    @RequestMapping("PeopleChargeController/newApplication")
    public String newApplication(Model model){
        Application application = new Application();
        Attachment attachment = new Attachment();
        Cost cost = new Cost();
        Participants participants = new Participants();
        Place place = new Place();
        Verification verification = new Verification();
        model.addAttribute("application", application);
        model.addAttribute("attachment", attachment);
        model.addAttribute("cost",cost);
        model.addAttribute("participants", participants);
        model.addAttribute("place", place);
        model.addAttribute("verification", verification);
        return "Pre-application";
    }

    @PostMapping("PeopleChargeController/insert")
    public String insert(@ModelAttribute("application") Application application,
                         @ModelAttribute("participants") List<Participants> participants,
                         @ModelAttribute("verification") Verification verification,
                         @ModelAttribute("attachments") List<Attachment> attachments,
                         @ModelAttribute("place") List<Place> places,
                         @ModelAttribute("cost") List<Cost> costs) {
        applicationService.insert(application, participants, verification, attachments, places, costs);
        return "redirect:/application/" + application.getApplicationId();
    }
}
