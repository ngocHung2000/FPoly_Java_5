package com.poly.Model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Animal2 {


    @NotEmpty(message = "{ma.empty}")
    String ma;
    @NotEmpty(message = "{ten.empty}")
    String ten;
    @NotEmpty(message = "{canNang.empty}")
    @Min(value = 0)
    int canNang;
    @NotEmpty(message = "{kv.empty}")
    String kv;
}
