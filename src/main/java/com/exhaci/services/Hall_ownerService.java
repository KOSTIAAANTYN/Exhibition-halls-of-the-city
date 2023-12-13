package com.exhaci.services;

import com.exhaci.model.Exhibition_hall;
import com.exhaci.model.users.Hall_owner;
import com.exhaci.repositories.Exhibition_hallRepository;
import com.exhaci.repositories.Hall_ownerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class Hall_ownerService {
    private final Hall_ownerRepository hall_ownerRepository;
    private final Exhibition_hallRepository exhibition_hallRepository;


    public void saveHall_owner(Hall_owner hall_owner) {
        Hall_owner existingOwner = hall_ownerRepository.findByPhoneNumber(hall_owner.getPhone_number());
        if (existingOwner == null || !existingOwner.getPhone_number().equals(hall_owner.getPhone_number())) {
            hall_ownerRepository.save(hall_owner);
        }

    }


    public List<Hall_owner> getHallOwnerList() {
        return hall_ownerRepository.findAll();
    }

    public void saveHall(Exhibition_hall exhibition_hall) {
        exhibition_hallRepository.save(exhibition_hall);
    }
}
