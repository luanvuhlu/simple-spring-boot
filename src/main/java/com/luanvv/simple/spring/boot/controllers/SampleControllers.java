package com.luanvv.simple.spring.boot.controllers;

import com.luanvv.simple.spring.boot.entities.Sample;
import com.luanvv.simple.spring.boot.repositories.SampleRepositories;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleControllers {

  private SampleRepositories repository;

  public SampleControllers(SampleRepositories repository) {
    this.repository = repository;
  }

  @GetMapping("/")
  public ResponseEntity<List<Sample>> list() {
    return ResponseEntity.ok(repository.findAll());
  }

  @PostMapping("/")
  public ResponseEntity<Sample> list(@RequestParam("name") String name) {
    return ResponseEntity.ok(repository.save(new Sample(name)));
  }
}
