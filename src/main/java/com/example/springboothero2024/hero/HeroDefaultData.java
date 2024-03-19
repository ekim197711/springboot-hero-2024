package com.example.springboothero2024.hero;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class HeroDefaultData {
    private final HeroRepository heroRepository;

    @PostConstruct
    void createHeroes() {
        heroRepository.saveAll(
                List.of(
                        HeroEntity.builder()
                                .superPower("Can eat many burgers in a row")
                                .name("Mike")
                                .age(46)
                                .build(),
                        HeroEntity.builder()
                                .superPower("Accurate with bow")
                                .name("Robin Hood")
                                .age(35)
                                .build(),
                        HeroEntity.builder()
                                .superPower("Good at creating stuff")
                                .name("Dr. Frankenstein")
                                .age(49)
                                .build(),
                        HeroEntity.builder()
                                .superPower("Good fighter")
                                .name("Daredevil")
                                .age(27)
                                .build()
                )
        );
    }
}
