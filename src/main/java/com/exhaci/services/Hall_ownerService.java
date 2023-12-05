package com.exhaci.services;

import com.exhaci.model.Hall_owner;
import com.exhaci.repositories.Hall_ownerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Hall_ownerService {
    private final Hall_ownerRepository hall_ownerRepository;

    public void saveHall_owner(Hall_owner hall_owner) {

        hall_ownerRepository.save(hall_owner);
    }
}
