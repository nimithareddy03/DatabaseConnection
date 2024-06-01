package com.targetindia.audit.repo;

import com.targetindia.audit.model.FileAudit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface PersonRepo extends JpaRepository<FileAudit, Long> {

}
