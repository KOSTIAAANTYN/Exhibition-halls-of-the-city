package com.exhaci.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table
public class Artists {
    //художник
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private LocalDate birthday;
    private String country;
    @Column(name="bio",columnDefinition="text")
    private String bio;
    private String a_work_of_art_info;
    @JoinColumn
    @ManyToOne
    private Exhibitions exhibitions;
    @OneToMany(cascade =CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "artists")
    private List<A_work_of_art> a_work_of_arts=new ArrayList<>();




}
