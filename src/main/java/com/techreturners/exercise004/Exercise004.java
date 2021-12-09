package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exercise004 {
    private LocalDateTime dateTime;

    public Exercise004(LocalDateTime dt) {
        this.setdatetime(dt);
    }


    public Exercise004(LocalDate date) {
        this.setdatetime(date.atStartOfDay());
    }


    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setdatetime(LocalDateTime dt){
        this.dateTime=dt.plusSeconds(1000000000L);
    }
}