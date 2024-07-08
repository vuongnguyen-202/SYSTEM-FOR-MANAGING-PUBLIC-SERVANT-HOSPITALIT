package com.example.CivlManagement.repository;

import com.example.CivlManagement.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface ApplicationRepository extends JpaRepository<Application, Long> {


}
