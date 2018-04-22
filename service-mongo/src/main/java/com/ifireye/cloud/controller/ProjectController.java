package com.ifireye.cloud.controller;

import com.google.common.collect.Lists;
import com.ifireye.cloud.common.JsonResponse;
import com.ifireye.cloud.po.ProjectPO;
import com.ifireye.cloud.repository.ProjectRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: JacobDong
 * @Date: 2018/4/22 21:02
 */
@RestController(value = "/projects")
public class ProjectController {

    @Resource
    private ProjectRepository projectRepository;

    @GetMapping
    public JsonResponse<List<ProjectPO>> getProjects() {
        Iterable<ProjectPO> all = projectRepository.findAll();
        return new JsonResponse(Lists.newArrayList(all));
    }
}
