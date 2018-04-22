package com.ifireye.cloud.repository;

import com.ifireye.cloud.po.ProjectPO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @Author: JacobDong
 * @Date: 2018/4/22 21:01
 */
@Repository
public interface ProjectRepository extends CrudRepository<ProjectPO, String> {
}
