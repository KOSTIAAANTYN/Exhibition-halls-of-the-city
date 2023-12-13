package com.exhaci.сontroller;

import com.exhaci.model.users.Artists;
import com.exhaci.repositories.ArtistsRepository;
import com.exhaci.services.ArtistsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ArtistsController {
    private final ArtistsService artistsService;

    @PostMapping("/artists/create")
    public String createArtists(Artists artists){
        artistsService.saveArtists(artists);
        return "redirect:/";
    }
}
