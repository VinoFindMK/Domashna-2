package com.ukim.finki.domashna2.repository;


import com.ukim.finki.domashna2.model.WineryInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WineryRepository extends JpaRepository<WineryInfo, Long> {

}
