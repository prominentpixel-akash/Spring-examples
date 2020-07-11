package com.prominentpixel.auth2_0.dao;

import com.prominentpixel.auth2_0.model.Test;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestDao extends CrudRepository<Test, Long> {

    @Query("SELECT t FROM Test t where id=:id")
    Test getId(Long id);
}
