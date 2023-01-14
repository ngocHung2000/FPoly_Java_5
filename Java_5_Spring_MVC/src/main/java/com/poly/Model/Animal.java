package com.poly.Model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Animal {
    @NotEmpty(message = "Ma trong")
    private String ma;
    @NotBlank(message = "{name.blank}")
//    @Pattern(message = "Sai dinh dang",regexp = "")
//    @Length
    private String ten;
    @NotBlank
    @Min(value = 4,message = "")
    @Max(value = 5)

    private float canNang;

}
