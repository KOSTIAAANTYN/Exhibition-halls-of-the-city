package com.exhaci.services;

import com.exhaci.model.A_work_of_art;
import com.exhaci.model.users.Artists;
import com.exhaci.repositories.A_work_of_artRepository;
import com.exhaci.repositories.ArtistsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class ArtistsService {
    private final ArtistsRepository artistsRepository;
    private final A_work_of_artRepository a_work_of_artRepository;

    public void saveArtists(Artists artists) {
        Artists existingArtists = artistsRepository.findByPhoneNumber(artists.getPhone_number());
        if (existingArtists == null || !existingArtists.getPhone_number().equals(artists.getPhone_number())){
            artistsRepository.save(artists);
        }
    }

    public void saveA_work_of_art(A_work_of_art art) {
        art.setDateOfCreate(LocalDate.now());
        a_work_of_artRepository.save(art);
    }

}
