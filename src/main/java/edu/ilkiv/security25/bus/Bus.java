package edu.ilkiv.security25.bus;

/*
@author   Bodya
@project   security25
@class  Bus
@version  1.0.0
@since 30.09.2025 - 19.06
*/


import lombok.*;

import java.util.Objects;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Bus {

    private String id;
    private String countryNumber;
    private String boardingNumber;

    public Bus(String countryNumber, String boardingNumber) {
        this.countryNumber = countryNumber;
        this.boardingNumber = boardingNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Bus bus)) return false;
        return Objects.equals(getId(), bus.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
