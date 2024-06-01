package com.targetindia.audit.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "file_audit")
public class FileAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "file_name", nullable = false)
    private String fileName;

    @Column(name = "analysis_id", nullable = false)
    private String analysisId;

    @Column(name = "scan_result", nullable = false)
    private boolean scanResult;

    @Column(name = "timestamp", nullable = false)
    private LocalDateTime timestamp = LocalDateTime.now();

    // Getters and setters
}
