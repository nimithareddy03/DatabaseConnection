package com.targetindia.audit.repo;

import com.targetindia.audit.model.FileAudit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileAuditRepository extends JpaRepository<FileAudit, Long> {
    FileAudit findByAnalysisId(String analysisId);
}
