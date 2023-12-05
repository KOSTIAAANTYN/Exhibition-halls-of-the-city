package com.exhaci.сontroller;

import com.exhaci.model.Hall_owner;
import com.exhaci.services.Hall_ownerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class Hall_ownerController {
    private final Hall_ownerService hallOwnerService;
    @GetMapping("/")
    public String returntest(){
     return "hall_owner";
    }

    @PostMapping("/hall_owner/create")
    public String createHall_owner(Hall_owner hall_owner){
        hallOwnerService.saveHall_owner(hall_owner);
        return "redirect:/";
    }


}
