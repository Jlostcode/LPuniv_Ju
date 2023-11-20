package com.project.lpuniv.dayoung.user.login.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private int user_no;
    private Integer user_tp;
    private String user_name;
    private String user_tel;
    private String user_loginId;
    private String user_passwd;
    private String user_email;
    private String user_brdt;
    private Integer user_gen;
    private String user_signdate;
    private String user_deletedate;


}
