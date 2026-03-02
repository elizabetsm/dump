package ru.lizka.pipiska.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.lizka.pipiska.entity.CrashEntity;
import ru.lizka.pipiska.remote.service.S5Service;
import ru.lizka.pipiska.repository.CrashRepository;

import java.util.List;

@Service
public class CrashService {
    private final S5Service s5Service;
    private final CrashRepository repository;

    public CrashService(S5Service s5Service, CrashRepository repository) {
        this.s5Service = s5Service;
        this.repository = repository;
    }

    public String save(MultipartFile file) {
        s5Service.sendFile(file);
        return null;
    }

    public List<CrashEntity> getAll() {
        return repository.findAll();
    }

    public CrashEntity getOne(String crashId) {
        return repository.findById(crashId).orElseThrow(RuntimeException::new);
    }
}
