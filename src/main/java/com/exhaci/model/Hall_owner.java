package com.exhaci.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Table(name = "hall_owner")
@Entity
public class Hall_owner {
    //власник залу
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String address;
    private String phone_number;

//    @JoinColumn
//    @ManyToMany(cascade =CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "hall_owners")
//    private List<Exhibition_hall> exhibition_halls=new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "hall_owner_exhibition_hall",
            joinColumns = @JoinColumn(name = "hall_owner_id"),
            inverseJoinColumns = @JoinColumn(name = "exhibition_hall_id")
    )
    private List<Exhibition_hall> exhibition_halls = new ArrayList<>();
}
