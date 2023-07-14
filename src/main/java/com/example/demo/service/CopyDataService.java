package com.example.demo.service;

import com.example.demo.dao.entity.CheckInStats;
import com.example.demo.dao.first.repository.FirstCheckInStatsRepository;
import com.example.demo.dao.second.repository.SecondCheckInStatsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CopyDataService {
    private final FirstCheckInStatsRepository firstCheckInStatsRepository;
    private final SecondCheckInStatsRepository secondCheckInStatsRepository;

    public CopyDataService(FirstCheckInStatsRepository firstCheckInStatsRepository, SecondCheckInStatsRepository secondCheckInStatsRepository) {
        this.firstCheckInStatsRepository = firstCheckInStatsRepository;
        this.secondCheckInStatsRepository = secondCheckInStatsRepository;
    }

    public void copyData() {
        List<CheckInStats> list = firstCheckInStatsRepository.findAll();
        secondCheckInStatsRepository.saveAll(list);
    }
}
