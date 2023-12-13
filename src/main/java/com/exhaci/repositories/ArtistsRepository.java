package com.exhaci.repositories;

import com.exhaci.model.users.Artists;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ArtistsRepository extends JpaRepository<Artists,Long> {

    @Query("SELECT h FROM Artists h WHERE h.phone_number = ?1")
    Artists findByPhoneNumber(String phone_number);
}
