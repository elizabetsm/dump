package ru.lizka.pipiska.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Entity
@Data
public class CrashEntity {
    @Id
    private String id;
    List<String> extensions;
    UUID guid;
    List<String> commandLineArgs;
    List<String> variations; // Список активных A/B тестов
}
