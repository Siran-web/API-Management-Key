package com.service.backend.dtos.apiKeyDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateApiKeyRequestDto {
    String name;
    List<String> scopes;
    LocalDate expiryDate;
}
