package com.service.backend.dtos.apiKeyDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiKeyResponseDto {
    private String keyId;
    private String maskedKey;
    private String name;
    private String status;
    private LocalDate createdAt;
}
