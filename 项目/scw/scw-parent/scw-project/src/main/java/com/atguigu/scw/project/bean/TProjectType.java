package com.atguigu.scw.project.bean;

import org.springframework.stereotype.Component;

@Component
public class TProjectType {
    private Integer id;

    private Integer projectid;

    private Integer typeid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }
}