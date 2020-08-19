package com.mf.warmtouch.model.entities;

import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.sql.Time;

@Data
@Entity
@Table(name = "day_availability")
public class DayAvailability
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "day_name")
    private String dayName;

    @Column(name = "is_available")
    private boolean isAvailable;

    @Column(name = "time_from")
    private Time timeFrom;

    @Column(name = "time_to")
    private Time timeTo;
}
