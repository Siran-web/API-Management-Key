package com.service.backend.dtos.apiKeyDtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegenerateApiKeyDto {
    private String apiKey;
}
