package com.example.springboothero2024.hero;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<HeroEntity, Long> {
}
