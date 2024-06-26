package com.KelvinGarcia.WareMind.ENTITY;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.ResultSet;


@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Proveedor {

    private String id;
    private String nombre;
    private String telefono;
    private String email;

}