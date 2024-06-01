package com.targetindia.audit.service;

import com.targetindia.audit.model.FileAudit;
import com.targetindia.audit.repo.FileAuditRepository;
import com.targetindia.audit.util.FileScanner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@Service
public class FileScanServiceImpl implements FileScanService {

    @Autowired
    private FileAuditRepository fileAuditRepository;

    @Autowired
    private FileScanner fileScanner;

    @Override
    public boolean scanFile(MultipartFile file) {
        boolean isMalicious = fileScanner.isFileMalicious(file);
        String analysisId = UUID.randomUUID().toString();

        FileAudit fileAudit = new FileAudit();
        fileAudit.setFileName(file.getOriginalFilename());
        fileAudit.setAnalysisId(analysisId);
        fileAudit.setScanResult(isMalicious);

        fileAuditRepository.save(fileAudit);

        return isMalicious;
    }

    @Override
    public boolean getScanResultByAnalysisId(String analysisId) {
        FileAudit fileAudit = fileAuditRepository.findByAnalysisId(analysisId);
        return fileAudit.isScanResult();
    }
}
