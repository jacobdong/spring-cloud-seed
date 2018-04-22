package com.ifireye.cloud.po;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * @Author: JacobDong
 * @Date: 2018/4/22 20:43
 */
@Data
@Document(collection = "projects")
public class ProjectPO {

    @Id
    private String id;
    @Indexed
    private String name;
    private String owner;
    private List<String> members;
    private String repository;
}
