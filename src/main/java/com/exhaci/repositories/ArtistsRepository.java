package com.exhaci.repositories;

import com.exhaci.model.Artists;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistsRepository extends JpaRepository<Artists,Long> {
}
