package com.exhaci.сontroller;

import com.exhaci.model.Exhibition_hall;
import com.exhaci.services.IndexService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequiredArgsConstructor
public class IndexController {
    private final IndexService indexService;

    @GetMapping("/")
    public String returnIndex(Model model) {
        model.addAttribute("exhibition_hallsList", indexService.getexhibition_hallsList());
        model.addAttribute("artsList", indexService.getArtsList());
        return "index";
    }

    @GetMapping("/registration")
    public String returnReg() {
        return "reg";
    }

    @GetMapping("/create_hall")
    public String returnCreateHall() {
        return "create_hall";
    }

    @GetMapping("/create_a_work_of_art")
    public String returnCreateArt() {
        return "create_art";
    }

    @GetMapping("/exhibition_hall/{id}")
    public String exhibition_hallInfo(@PathVariable Long id, Model model) {
        Exhibition_hall exhibition_hall = indexService.getexhibition_hallById(id);
        model.addAttribute("exhibition_hall", exhibition_hall);

        return "exhibition_hall-info";
    }
}
