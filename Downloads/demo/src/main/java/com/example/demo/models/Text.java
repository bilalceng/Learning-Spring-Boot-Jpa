package com.example.demo.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DiscriminatorFormula;

@Data
@Entity
@AllArgsConstructor
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
//@PrimaryKeyJoinColumn(name = "text_id")
//@DiscriminatorValue("T") -->> just used for @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Text extends Resource{
    private String content;
}
