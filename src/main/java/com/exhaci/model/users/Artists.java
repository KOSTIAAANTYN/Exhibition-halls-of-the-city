package com.exhaci.model.users;

import com.exhaci.model.A_work_of_art;
import com.exhaci.model.Exhibitions;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@DiscriminatorValue("artist")
public class Artists extends User {
    //художник
    private String name;
    private LocalDate birthday;
    private String country;
    private String phone_number;
    @Column(name="bio",columnDefinition="text")
    private String bio;
    @JoinColumn
    @ManyToOne
    private Exhibitions exhibitions;
    @OneToMany(cascade =CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "artists")
    private List<A_work_of_art> a_work_of_arts=new ArrayList<>();


    @Override
    public String getUserType() {
        return "artist";
    }
}
