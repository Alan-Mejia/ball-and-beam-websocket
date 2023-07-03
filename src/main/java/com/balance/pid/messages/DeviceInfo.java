package com.balance.pid.messages;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class DeviceInfo {
    private String from;
    private String to;
    private String action;

    private Double kp;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Double ki;
    private Double kd;
    private Float currentDistance;
    private Float setPoint;
    private Integer servoAngleFrom;
    private Integer servoAngleTo;
}
