package com.exhaci.model;

import com.exhaci.model.users.Artists;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
public class Exhibitions {
    //виставки
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String exhibitionsType;
    private LocalDateTime localDateTime;
    @JoinColumn
    @ManyToOne
    private Exhibition_hall exhibition_hall;
    @OneToMany(cascade =CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "exhibitions")
    private List<Artists> artists=new ArrayList<>();

}

