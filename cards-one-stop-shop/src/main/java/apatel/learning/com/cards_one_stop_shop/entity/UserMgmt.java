package apatel.learning.com.cards_one_stop_shop.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "user_mgmt_v1", uniqueConstraints = {
        @UniqueConstraint(columnNames = "userName")
})
public class UserMgmt {

    @Id
    @Column(name = "userId", nullable = false)
    private Long userId;

    @NotNull
    @Column(name = "userName", nullable = false, unique = true)
    private String userName;

    @Column(name = "userPassword", nullable = false)
    private String userPassword;

    @Column(name = "userRole", nullable = false)
    private String userRole; // ADMIN | NORMAL

    // Getters and Setters

    public Long getUserId() { return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public String getUserName() { return userName; }
    public void setUserName(String userName) { this.userName = userName; }

    public String getUserPassword() { return userPassword; }
    public void setUserPassword(String userPassword) { this.userPassword = userPassword; }

    public String getUserRole() { return userRole; }
    public void setUserRole(String userRole) { this.userRole = userRole; }
}

