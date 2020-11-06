package com.moon.shadowing.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moon.shadowing.repository.UserMasterRepository;

import javax.transaction.Transactional;


@Service
public class UserMasterService {

    @Autowired
    private UserMasterRepository master;

//    @Transactional
//    public void deleteById(Long masterId) {
//        master.deleteById(masterId);
//    }
}
