package com.amal.livres.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amal.livres.entities.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {

}
