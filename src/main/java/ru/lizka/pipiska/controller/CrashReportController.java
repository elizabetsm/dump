package ru.lizka.pipiska.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import ru.lizka.pipiska.service.CrashService;

import java.util.Map;

@RestController("/i/api/")
public class CrashReportController {

    private final CrashService service;

    public CrashReportController(CrashService service) {
        this.service = service;
    }

    @PostMapping("cr/report")
    public ResponseEntity<String> receiveCrash(
            @RequestParam("upload_file_minidump") MultipartFile minidump,
            @RequestParam Map<String, String> allFields
    ) {
        service.save(minidump);
        return ResponseEntity.ok("aljhbgfaeq");
    }
}