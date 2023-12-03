package com.exhaci.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
public class Exhibition_hall  {
    //виставочний зал
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int area;
    private String address;
    private String phone_number;
    @JoinColumn
    @ManyToOne
    private Hall_owner hall_owner;
    @OneToMany(cascade =CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "exhibition_hall")
    private List<Exhibitions> exhibitions=new ArrayList<>();




}
