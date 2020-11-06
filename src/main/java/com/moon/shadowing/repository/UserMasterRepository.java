package com.moon.shadowing.repository;

import com.moon.shadowing.domain.UserMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserMasterRepository extends JpaRepository<UserMaster, Long> {

}
