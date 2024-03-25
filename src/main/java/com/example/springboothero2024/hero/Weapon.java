package com.example.springboothero2024.hero;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Embeddable
@Getter
@Setter
public class Weapon {
    @Column(name = "weapon_name")
    private String name;
    private int powerLevel;
    private int durability;
}
