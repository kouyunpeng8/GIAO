package com.example.bestkj.service;

import com.example.bestkj.pojo.Name;
import org.springframework.stereotype.Service;


public interface NameService {

    public Name selectName(String name);
}
