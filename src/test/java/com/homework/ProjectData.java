package com.homework;

public class ProjectData {
    private final String summary;
    private final String descriprion;

    public ProjectData(String summary, String descriprion) {
        this.summary = summary;
        this.descriprion = descriprion;

    }

    public String getSummary() {
        return summary;
    }

    public String getDescriprion() {
        return descriprion;
    }
}
