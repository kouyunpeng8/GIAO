package com.example.bestkj.service.impl;

import com.example.bestkj.dao.NameMapper;
import com.example.bestkj.pojo.Name;
import com.example.bestkj.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NameServiceImpl implements NameService {

    @Autowired
    private NameMapper nameMapper;

    @Override
    public Name selectName(String name) {
        Name name1 = new Name();
        name1.setName(name);
        return nameMapper.selectOne(name1);
    }
}
