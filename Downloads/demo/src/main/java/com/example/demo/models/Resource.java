package com.example.demo.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@Entity
@AllArgsConstructor
@SuperBuilder
@NoArgsConstructor
//@Inheritance(strategy = InheritanceType.JOINED)
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name = "resource_type") just used for --->> @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Resource{
    @Id
    @GeneratedValue
    private Integer id;
    private String name ;

    private int size;
    private String url;

    @OneToOne
    @JoinColumn(name = "lecture_id")
    private Lecture lecture;

}
