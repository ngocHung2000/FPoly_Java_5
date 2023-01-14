package com.hangnt169.it17203.B2_RequestMapping.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SinhVien {
    @NotEmpty
    private String ma;

    @NotEmpty(message = "ten trong")
//    @NotEmpty(message = "{ten.empty}")
//    @Length : check do dai
//    @Pattern(message = "Sai dinh dang",regexp = "")
    private String ten;

    @Min(value = 5,message = "Tuoi phai lon hon hoac bang 5")
    private int tuoi;

}
