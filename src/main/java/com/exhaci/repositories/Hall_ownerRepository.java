package com.exhaci.repositories;

import com.exhaci.model.Hall_owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Hall_ownerRepository extends JpaRepository<Hall_owner, Long> {

    @Query("SELECT h FROM Hall_owner h WHERE h.phone_number = ?1")
    Hall_owner findByPhoneNumber(String phoneNumber);

}

