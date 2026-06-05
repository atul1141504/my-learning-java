package apatel.learning.com.cards_one_stop_shop.service;

import apatel.learning.com.cards_one_stop_shop.entity.UserMgmt;
import apatel.learning.com.cards_one_stop_shop.repository.UserMgmtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserMgmtService {

    @Autowired
    private UserMgmtRepository userMgmtRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public List<UserMgmt> getAllUsers() {
        return userMgmtRepository.findAll();
    }

    public List<UserMgmt> search(String userIdStr, String userName) {
        Long userId = null;
        if (userIdStr != null && !userIdStr.isBlank()) {
            try { userId = Long.parseLong(userIdStr.trim()); } catch (NumberFormatException ignored) {}
        }
        
        String uname = (userName != null && !userName.isBlank()) ? userName.trim() : null;
        if (userId == null && uname == null) return userMgmtRepository.findAll();
        return userMgmtRepository.search(userId, uname);
    }

    public UserMgmt getByUserName(String userName) {
        return userMgmtRepository.findByUserName(userName).orElse(null);
    }

    public UserMgmt getById(Long userId) {
        return userMgmtRepository.findById(userId).orElse(null);
    }

    public boolean existsByUserName(String userName) {
        return userMgmtRepository.findByUserName(userName).isPresent();
    }

    /**
     * Save a user. If rawPassword is non-blank, it is BCrypt-encoded before persisting.
     * If rawPassword is blank (edit without changing password), the existing hash is kept.
     */
    public void save(UserMgmt user, String rawPassword) {
        if (rawPassword != null && !rawPassword.isBlank()) {
            user.setUserPassword(passwordEncoder.encode(rawPassword));
        }
        userMgmtRepository.save(user);
    }

    public void deleteById(Long userId) {
        userMgmtRepository.deleteById(userId);
    }
}

