package com.poly.Model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class StudentInfo {
    @NotEmpty(message = "Field NULL")
    private String ma;
    @NotEmpty(message = "Field NULL")
    private String ten;
    @NotEmpty(message = "Field NULL")
    @Min(value = 1,message = "False")
    private int tuoi;
    @NotEmpty(message = "Field NULL")
    private String que;
}
