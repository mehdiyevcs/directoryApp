package com.mehdiyevcs.directoryApp.dao;

import com.mehdiyevcs.directoryApp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDao extends JpaRepository<Student,Integer> {
}
