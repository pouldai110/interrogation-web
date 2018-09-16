package com.cebon.ncjw.test.service.impl;

import com.cebon.ncjw.test.entity.TestModel;
import com.cebon.ncjw.test.respository.TestDemoRespository;
import com.cebon.ncjw.test.service.TestDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service(value = "testDemoService")
@Transactional
public class TestDemoServiceImpl implements TestDemoService {
    @Autowired
    private TestDemoRespository testDemoRespository;

    @Override
    public TestModel getUser(Long id) {
        Optional<TestModel> op = testDemoRespository.findById(id);
        if(op.isPresent()) {
            return  op.get();
        }
        return null;
    }
}
