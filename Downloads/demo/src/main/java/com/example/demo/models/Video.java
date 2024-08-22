package com.example.demo.models;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@Entity
@AllArgsConstructor
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
//@PrimaryKeyJoinColumn(name = "video_id")
//@DiscriminatorValue("T") -->> just used for @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Video extends Resource {
    private int length;
}
