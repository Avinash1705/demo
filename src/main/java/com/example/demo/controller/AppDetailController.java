package com.example.demo.controller;

import com.example.demo.entity.appDetail.AppDetail;
import com.example.demo.repository.AppDetailRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/app")
public class AppDetailController {

    private final AppDetailRepository repo;

    public AppDetailController(AppDetailRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/all")
    public List<AppDetail> getAll() {
        return repo.findAll();
    }
}
