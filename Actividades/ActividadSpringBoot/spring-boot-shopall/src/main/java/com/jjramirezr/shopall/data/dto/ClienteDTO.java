package com.jjramirezr.shopall.data.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class ClienteDTO {

    private String nombre;
    private String email;
    private Timestamp createTime;
}
