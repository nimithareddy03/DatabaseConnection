package com.targetindia.audit.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileScanService {
    boolean scanFile(MultipartFile file);
    boolean getScanResultByAnalysisId(String analysisId);
}
