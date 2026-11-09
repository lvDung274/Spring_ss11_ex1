package com.example.patient.models.dto.req;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record PatientReq(
        @NotBlank(message = "Tên không được bỏ trống!")
         String name ,

         @Positive(message = "Tuổi phải là số nguyên dương")
         Integer age
) {
}
