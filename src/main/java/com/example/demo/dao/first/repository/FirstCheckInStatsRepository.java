package com.example.demo.dao.first.repository;

import com.example.demo.dao.entity.CheckInStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirstCheckInStatsRepository extends JpaRepository<CheckInStats, Long>{
}
