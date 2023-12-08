package com.exhaci.services;

import com.exhaci.model.Exhibition_hall;
import com.exhaci.repositories.Exhibition_hallRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IndexService {
    private final Exhibition_hallRepository exhibition_hallRepository;


    public List<Exhibition_hall> getexhibition_hallsList() {
        return exhibition_hallRepository.findAll();
    }

    public Exhibition_hall getexhibition_hallById(Long id) {
        return exhibition_hallRepository.findById(id).orElse(null);
    }
}