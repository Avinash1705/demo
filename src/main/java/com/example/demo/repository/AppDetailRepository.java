package com.example.demo.repository;

import com.example.demo.entity.appDetail.AppDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppDetailRepository extends JpaRepository<AppDetail, Long> {
}
