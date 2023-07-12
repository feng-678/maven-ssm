package com.kgc.ssm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private Long id;
    private String loginname;
    private String password;
    private String username;
    private Integer status;
    private Integer createBy;

}
