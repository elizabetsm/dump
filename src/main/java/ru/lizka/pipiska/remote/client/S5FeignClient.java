package ru.lizka.pipiska.remote.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import ru.lizka.pipiska.remote.confing.FeignSupportConfig;

@FeignClient(name = "s5-client", configuration = FeignSupportConfig.class)
public interface S5FeignClient {
    @PostMapping(value = "/file", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    void sendFile(@RequestPart("file")MultipartFile file);
}
