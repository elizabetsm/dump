package ru.lizka.pipiska.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.lizka.pipiska.entity.CrashEntity;

import java.util.UUID;

public interface CrashRepository extends JpaRepository<CrashEntity, String> {
}
