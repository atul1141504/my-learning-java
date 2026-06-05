package apatel.learning.com.cards_one_stop_shop.service;

import apatel.learning.com.cards_one_stop_shop.entity.ProjectData;
import apatel.learning.com.cards_one_stop_shop.repository.ProjectDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ProjectDataService {

    private static final int PAGE_SIZE = 50;

    @Autowired
    private ProjectDataRepository projectDataRepository;

    public Page<ProjectData> getProjects(String projectId, String projectDescription,
                                         String fromYear, String toYear, String month, String status, int page) {
        return projectDataRepository.findByFilters(
                projectId, projectDescription, fromYear, toYear, month, status,
                PageRequest.of(page, PAGE_SIZE));
    }

    public ProjectData getById(String projectId) {
        return projectDataRepository.findById(projectId).orElse(null);
    }

    public ProjectData save(ProjectData project) {
        return projectDataRepository.save(project);
    }
}

