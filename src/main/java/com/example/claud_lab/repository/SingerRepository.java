package com.example.claud_lab.repository;

import com.example.claud_lab.domain.Singer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SingerRepository extends JpaRepository<Singer, Integer> {
}
