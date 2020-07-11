package com.prominentpixel.controller;

import com.prominentpixel.dao.StudentDao;
import com.prominentpixel.model.StudentModel;
import com.prominentpixel.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private CacheManager cacheManager;

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public StudentModel save(StudentModel studentModel) {
        return studentService.save(studentModel);
    }

    @CacheEvict(value = "student", allEntries=true)
    @RequestMapping(value = "listStudent", method = RequestMethod.GET)
    public List<StudentModel> listStudent() {
        return studentService.findAll();
    }

    @RequestMapping(value = "clearCache")
    public void clearCache() {
        for (String name : cacheManager.getCacheNames()) {
            cacheManager.getCache(name).clear();
        }
    }
}