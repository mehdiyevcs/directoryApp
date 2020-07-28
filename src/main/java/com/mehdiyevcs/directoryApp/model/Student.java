package com.mehdiyevcs.directoryApp.model;


import lombok.Data;

import javax.persistence.*;

@Entity
public @Data
class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private int id;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "university_name")
    private String universityName;

    @Column(name = "speciality_name")
    private String specialityName;

    @Column(name = "job_title")
    private String jobTitle;


}
