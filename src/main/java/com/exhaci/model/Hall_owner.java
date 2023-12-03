package com.exhaci.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Table
@Entity
public class Hall_owner {
    //власник залу
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String address;
    private String phone_number;
    @OneToMany(cascade =CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "hall_owner")
    private List<Exhibition_hall> exhibition_halls=new ArrayList<>();
}
