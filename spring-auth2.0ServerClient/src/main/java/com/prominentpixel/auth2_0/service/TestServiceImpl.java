package com.prominentpixel.auth2_0.service;

import com.prominentpixel.auth2_0.dao.TestDao;
import com.prominentpixel.auth2_0.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestDao testDao;

    @Override
    public Test getId(Long id) {
        return testDao.getId(id);
    }
}
