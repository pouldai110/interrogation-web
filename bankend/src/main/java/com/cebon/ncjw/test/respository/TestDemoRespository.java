package com.cebon.ncjw.test.respository;

import com.cebon.ncjw.test.entity.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TestDemoRespository extends JpaRepository<TestModel, Long> {
    public TestModel findAllByUserNameIsNull();
}
