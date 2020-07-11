package com.prominentpixel.service;

import com.prominentpixel.dao.StudentDao;
import com.prominentpixel.model.StudentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    @Cacheable(value="students")
    public List<StudentModel> findAll() {
        return studentDao.findAll();
    }

    @Override
    @CacheEvict(value = "students", allEntries=true)
    public StudentModel save(StudentModel studentModel) {
        return studentDao.save(studentModel);
    }
}