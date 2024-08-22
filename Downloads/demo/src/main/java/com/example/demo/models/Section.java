package com.example.demo.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Section extends BaseEntity {

    private String name;

    private int OrderNumber;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @OneToMany(mappedBy ="section")
    private List<Lecture> lectures;

}
