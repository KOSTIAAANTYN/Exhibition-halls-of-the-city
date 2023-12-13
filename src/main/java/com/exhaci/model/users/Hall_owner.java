package com.exhaci.model.users;

import com.exhaci.model.Exhibition_hall;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@DiscriminatorValue("hall_owner")
@Entity
public class Hall_owner extends User{
    //власник залу
    private String name;
    private String address;
    private String phone_number;


    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "hall_owner_exhibition_hall",
            joinColumns = @JoinColumn(name = "hall_owner_id"),
            inverseJoinColumns = @JoinColumn(name = "exhibition_hall_id")
    )
    private List<Exhibition_hall> exhibition_halls = new ArrayList<>();

    @Override
    public String getUserType() {
        return "hall_owner";
    }
}
