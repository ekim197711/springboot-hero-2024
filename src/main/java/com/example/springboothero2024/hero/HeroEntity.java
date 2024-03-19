package com.example.springboothero2024.hero;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "hero")
@SuperBuilder
@AllArgsConstructor
public class HeroAbstract extends AbstractCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String superPower;
}
