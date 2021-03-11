package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.data.EventCategoryRepository;
import org.launchcode.codingevents.models.EventCategory;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("eventCategories")
public class EventCategoryController {

    private EventCategoryRepository eventCategoryRepository;

    @GetMapping("index")
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Categories");
        model.addAttribute("categories", eventCategoryRepository.findAll());

        return "";
    }

    @GetMapping("create")
    public String renderCreateEventCategoryForm(Model model) {
        model.addAttribute("title", "Create Category");
        model.addAttribute(new EventCategory());
        return "";
    }

    @GetMapping
    public String processCreateEventCategoryForm(Errors errors, Model model) {
        if (errors.hasErrors()) {
            return "redirect:";
        }
        model.addAttribute("title", "Create Category");
        model.addAttribute(new EventCategory());

        return "eventCategories/create";
    }


}
