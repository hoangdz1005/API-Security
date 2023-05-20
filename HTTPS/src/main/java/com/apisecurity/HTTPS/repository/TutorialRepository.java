package com.apisecurity.HTTPS.repository;

import com.apisecurity.HTTPS.model.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
}
