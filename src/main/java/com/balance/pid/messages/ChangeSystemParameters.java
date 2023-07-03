package com.balance.pid.messages;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ChangeSystemParameters {
    private String from;
    private String to;
    private String action;

    private Double newKp;
    private Double newKi;
    private Double newKd;
    private Float newSetPoint;
}
