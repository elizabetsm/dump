package ru.lizka.pipiska.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.lizka.pipiska.entity.CrashEntity;
import ru.lizka.pipiska.service.CrashService;

import java.util.List;

@RestController("/a/")
public class AdminController {

    private final CrashService service;

    public AdminController(CrashService service) {
        this.service = service;
    }

    @GetMapping("crashes")
    public ResponseEntity<List<CrashEntity>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("crashes/{crashId}")
    public ResponseEntity<CrashEntity> getOne(@PathVariable("crashId") String crashId) {
        return ResponseEntity.ok(service.getOne(crashId));
    }
}
