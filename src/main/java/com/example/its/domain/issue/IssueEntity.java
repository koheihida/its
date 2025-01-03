package com.example.its.domain.issue;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class IssueEntity {
    private Long   id;
    private String summary;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
