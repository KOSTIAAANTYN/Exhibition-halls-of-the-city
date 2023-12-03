package com.exhaci.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table
@Data
public class A_work_of_art {
    //витвір мистецтва
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String art_material;
    private LocalDate dateOfCreate;
    private int height;
    private int width;
    @JoinColumn
    @ManyToOne
    private Artists artists;




}
