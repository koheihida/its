package com.example.its.domain.issue;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueService {

    public List<IssueEntity> findAll() {
      return List.of(
                new IssueEntity(1L, "概要1", "説明1"),
                new IssueEntity(2L, "概要2", "説明2"),
                new IssueEntity(3L, "概要3", "説明3")
        );
    }
}