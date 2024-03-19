package com.example.springboothero2024.hero;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


@Setter
@Getter
@Entity
@Table(name = "hero")
@SuperBuilder
@NoArgsConstructor
public class HeroEntity extends AbstractCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String superPower;
}
