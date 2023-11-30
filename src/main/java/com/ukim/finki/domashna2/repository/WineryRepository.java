package com.ukim.finki.domashna2.repository;


import com.ukim.finki.domashna2.model.WineryInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WineryRepository extends JpaRepository<WineryInfo, Long> {
    Page<WineryInfo> findAll(Pageable pageable);
}