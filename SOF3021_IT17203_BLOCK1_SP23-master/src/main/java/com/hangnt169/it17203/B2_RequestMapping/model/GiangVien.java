package com.hangnt169.it17203.B2_RequestMapping.model;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GiangVien {

    private String ma;

    @NotEmpty(message = "{ten.empty}")
    private String ten;

    private String diaChi;
}
