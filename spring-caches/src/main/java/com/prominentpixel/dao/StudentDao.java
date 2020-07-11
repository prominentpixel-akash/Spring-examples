package com.prominentpixel.dao;

import com.prominentpixel.model.StudentModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface StudentDao extends CrudRepository<StudentModel, Long> {
    List<StudentModel> findAll();
}