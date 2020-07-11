package com.prominentpixel.service;

import com.prominentpixel.model.StudentModel;
import java.util.List;

public interface StudentService {
    List<StudentModel> findAll();
    StudentModel save(StudentModel studentModel);
  //  void delete(long studentId);
}