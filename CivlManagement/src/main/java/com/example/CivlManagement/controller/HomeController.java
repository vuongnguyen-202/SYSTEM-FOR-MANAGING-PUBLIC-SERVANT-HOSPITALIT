package com.example.CivlManagement.controller;

import com.example.CivlManagement.entity.*;
import com.example.CivlManagement.repository.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Date;
import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private ApplicationRepository applicationRepository;

    @Autowired
    private AttachmentRepository attachmentRepository;
    @Autowired
    private CostRepository costRepository;
    @Autowired
    private ParticipantsRepository participantsRepository;
    @Autowired
    private VerificationRepository verificationRepository;
    @Autowired
    private PlaceRepository placeRepository;
    @RequestMapping("/")
    public String ListScreen(Model model) {
        List<Application> applications = applicationRepository.findAll();
        model.addAttribute("applications", applications);
        return "ListScreen";
    }


}
