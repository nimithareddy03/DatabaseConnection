package com.targetindia.audit.util;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class FileScanner {

    public boolean isFileMalicious(MultipartFile file) {
        // Simulate a file scan and return whether it is malicious or not
        // In a real implementation, you would integrate with a virus scanner API
        return file.getOriginalFilename().contains("malicious");
    }
}
