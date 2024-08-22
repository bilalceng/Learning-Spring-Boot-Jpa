package com.example.demo.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Data
@Entity
@AllArgsConstructor
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Author  extends BaseEntity{


    /*
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "author_id_gen"
    )
   @SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_id_seq", allocationSize = 1
    )*/
/*
    @TableGenerator(
            name = "author_id_gen",
            allocationSize = 1,
            table = "author_id_generator",
            pkColumnName = "id_key",
            valueColumnName = "id_value",
            initialValue = 1
    )
    */

    @Column(
            nullable = false
    )
    private String lastName;
    @Column(
            nullable = false
    )
    private String firstName;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;


    /*
    @Column(
            nullable = false
    )
    private Integer age;


    @Column(
            nullable = false,
            updatable = false,
            insertable = true
    )

    private LocalDateTime createdAt;
    @Column(
            insertable = false,
            updatable = true
    )

    private LocalDateTime lastModified;
  */
    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

}
