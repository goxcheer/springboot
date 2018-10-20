package com.qgx.demo01.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Map;

@RestController
@Slf4j
public class UploadController {

    @Value("${filepath}")
    private String filepath;

    @PostMapping("/upload")
    public String upload(MultipartFile file) throws Exception{
        String fileName = file.getOriginalFilename();
        log.info(fileName);
        file.transferTo(new File(filepath+fileName));
        return "OK";
    }
}
