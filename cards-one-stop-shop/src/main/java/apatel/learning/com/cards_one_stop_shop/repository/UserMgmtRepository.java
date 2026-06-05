package apatel.learning.com.cards_one_stop_shop.repository;

import apatel.learning.com.cards_one_stop_shop.entity.UserMgmt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserMgmtRepository extends JpaRepository<UserMgmt, Long> {

    Optional<UserMgmt> findByUserName(String userName);

    @Query("SELECT u FROM UserMgmt u WHERE "
            + "(:userId IS NULL OR u.userId = :userId) AND "
            + "(:userName IS NULL OR LOWER(u.userName) LIKE LOWER(CONCAT('%', :userName, '%')))")
    List<UserMgmt> search(@Param("userId") Long userId, @Param("userName") String userName);
}

