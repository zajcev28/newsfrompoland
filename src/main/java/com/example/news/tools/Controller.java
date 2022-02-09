package com.example.news.tools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {

    Worker worker;

    @Autowired
    public Controller(Worker worker) {
        this.worker = worker;
    }

    @RequestMapping("/")
    public String home() {
        return "/inspections";
    }

    @GetMapping
    public String showInspections(Model model) {
        model.addAttribute("allNews", worker.getAllNews());
        return "inspections";
    }
}
