package apatel.learning.com.cards_one_stop_shop.repository;

import apatel.learning.com.cards_one_stop_shop.entity.ProjectData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectDataRepository extends JpaRepository<ProjectData, String> {

    @Query(value = 
            "SELECT * FROM project_data p WHERE " +
            "(:projectId IS NULL OR :projectId = '' OR p.projectId LIKE CONCAT('%',:projectId,'%')) AND " +
            "(:projectDescription IS NULL OR :projectDescription = '' OR p.projectDescription LIKE CONCAT('%',:projectDescription,'%')) AND " +
            "(:fromYear IS NULL OR :fromYear = '' OR (p.releaseDate IS NOT NULL AND p.releaseDate NOT IN ('','TBD') AND RIGHT(p.releaseDate,4) >= :fromYear)) AND " +
            "(:toYear IS NULL OR :toYear = '' OR (p.releaseDate IS NOT NULL AND p.releaseDate NOT IN ('','TBD') AND RIGHT(p.releaseDate,4) <= :toYear)) AND " +
            "(:month IS NULL OR :month = '' OR (p.releaseDate IS NOT NULL AND p.releaseDate NOT IN ('','TBD') AND UPPER(SUBSTRING(p.releaseDate,4,3)) = :month)) AND " +
            "(:status IS NULL OR :status = '' OR p.status = :status)",
           countQuery = 
            "SELECT COUNT(*) FROM project_data p WHERE " +
            "(:projectId IS NULL OR :projectId = '' OR p.projectId LIKE CONCAT('%',:projectId,'%')) AND " +
            "(:projectDescription IS NULL OR :projectDescription = '' OR p.projectDescription LIKE CONCAT('%',:projectDescription,'%')) AND " +
            "(:fromYear IS NULL OR :fromYear = '' OR (p.releaseDate IS NOT NULL AND p.releaseDate NOT IN ('','TBD') AND RIGHT(p.releaseDate,4) >= :fromYear)) AND " +
            "(:toYear IS NULL OR :toYear = '' OR (p.releaseDate IS NOT NULL AND p.releaseDate NOT IN ('','TBD') AND RIGHT(p.releaseDate,4) <= :toYear)) AND " +
            "(:month IS NULL OR :month = '' OR (p.releaseDate IS NOT NULL AND p.releaseDate NOT IN ('','TBD') AND UPPER(SUBSTRING(p.releaseDate,4,3)) = :month)) AND " +
            "(:status IS NULL OR :status = '' OR p.status = :status)",
           nativeQuery = true)
    Page<ProjectData> findByFilters(
            @Param("projectId") String projectId,
            @Param("projectDescription") String projectDescription,
            @Param("fromYear") String fromYear,
            @Param("toYear") String toYear,
            @Param("month") String month,
            @Param("status") String status,
            Pageable pageable);
}
