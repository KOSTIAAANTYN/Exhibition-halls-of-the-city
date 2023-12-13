package com.exhaci.сontroller;

import com.exhaci.model.Exhibition_hall;
import com.exhaci.model.users.Hall_owner;
import com.exhaci.services.Hall_ownerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class Hall_ownerController {
    private final Hall_ownerService hallOwnerService;

    @GetMapping("/hall_owner")
    public String returntestandList(Model model) {
        model.addAttribute("hall_ownerList", hallOwnerService.getHallOwnerList());
        return "hall_owner";
    }

    @PostMapping("/hall_owner/create")
    public String createHall_owner(Hall_owner hall_owner) {
        hallOwnerService.saveHall_owner(hall_owner);
        return "redirect:/hall_owner";
    }

    @PostMapping("/create_hall/create")
    public String createHall(Exhibition_hall exhibition_hall) {
        hallOwnerService.saveHall(exhibition_hall);
        return "redirect:/";
    }


}
