package com.luanvv.simple.spring.boot.repositories;

import com.luanvv.simple.spring.boot.entities.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepositories extends JpaRepository<Sample, Integer> {

}
