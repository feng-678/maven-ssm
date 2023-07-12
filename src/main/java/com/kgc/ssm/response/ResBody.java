package com.kgc.ssm.response;

import lombok.*;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
@Component
public class ResBody<T> {
    private  String message;
    private T Date;
    private int status;


}
