package com.ifireye.cloud.repository;

import com.ifireye.cloud.po.ProjectPO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Optional;

/**
 * @Author: JacobDong
 * @Date: 2018/4/22 21:19
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjectRepositoryTest {

    @Resource
    private ProjectRepository projectRepository;

    private static final String TEST_ID = "test_id";


    @Test
    public void inertTest() {
        ProjectPO projectPO = new ProjectPO();
        projectPO.setId(TEST_ID);
        projectPO.setMembers(Arrays.asList("jim", "lilei"));
        projectPO.setName("spring-cloud-seed");
        projectPO.setOwner("jim");
        projectPO.setRepository("http://cloud.ifireye.com/git/xxx.git");
        projectRepository.save(projectPO);
    }

    @Test
    public void queryTest() {
        Optional<ProjectPO> findById = projectRepository.findById(TEST_ID);
        Assert.assertTrue(findById.isPresent());
    }
}