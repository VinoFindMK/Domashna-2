package com.ukim.finki.domashna2.repository;

import com.ukim.finki.domashna2.model.WineryInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WineryRepository extends JpaRepository<WineryInfo, Long> {
    Page<WineryInfo> findAll(Pageable pageable);
    Optional<WineryInfo> findByName(String name);
    Page<WineryInfo> findByNameContainingIgnoreCase(String name, Pageable pageable);



}