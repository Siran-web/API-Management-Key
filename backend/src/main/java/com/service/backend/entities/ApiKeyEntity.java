package com.service.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ApiKey")
public class ApiKeyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String keyValue;

    private String name;

    private boolean active = true;

    private LocalDateTime createdAt;

    private LocalDateTime expiresAt;

    @ElementCollection
    private List<String> scopes;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
