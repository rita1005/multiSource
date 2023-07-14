package com.example.demo.dao.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "check_in_stats")
public class CheckInStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", columnDefinition = "INT NOT NULL")
    private Long userId;

    @Column(name = "time_difference", columnDefinition = "INT NOT NULL")
    private Long timeDifference;

    public CheckInStats() {
    }

    public CheckInStats(Long userId, Long timeDifference) {
        this.userId = userId;
        this.timeDifference = timeDifference;
    }

}
