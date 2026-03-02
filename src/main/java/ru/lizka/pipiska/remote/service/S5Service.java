package ru.lizka.pipiska.remote.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.lizka.pipiska.remote.client.S5FeignClient;

@Service
public class S5Service {

    private final S5FeignClient client;

    public S5Service(S5FeignClient client) {
        this.client = client;
    }

    public void sendFile(MultipartFile file) {
        client.sendFile(file);
    }
}
