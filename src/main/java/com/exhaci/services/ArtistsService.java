package com.exhaci.services;

import com.exhaci.model.users.Artists;
import com.exhaci.repositories.ArtistsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArtistsService {
    private final ArtistsRepository artistsRepository;

    public void saveArtists(Artists artists) {
        Artists existingArtists = artistsRepository.findByPhoneNumber(artists.getPhone_number());
        if (existingArtists == null || !existingArtists.getPhone_number().equals(artists.getPhone_number())){
            artistsRepository.save(artists);
        }
    }
}
