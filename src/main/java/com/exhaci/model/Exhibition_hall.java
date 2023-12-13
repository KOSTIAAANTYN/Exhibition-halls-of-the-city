package com.exhaci.model;

import com.exhaci.model.users.Hall_owner;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "exhibition_hall")
@Data
public class Exhibition_hall  {
    //виставочний зал
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private int area;
    private String address;
    private String phone_number;

//    @JoinColumn
//    @ManyToMany(cascade =CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "exhibition_halls")
//    private List<Hall_owner> hall_owners=new ArrayList<>();

    @ManyToMany(mappedBy = "exhibition_halls", cascade = CascadeType.ALL)
    private List<Hall_owner> hall_owners = new ArrayList<>();

    @OneToMany(cascade =CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "exhibition_hall")
    private List<Exhibitions> exhibitions=new ArrayList<>();




}
