package apatel.learning.com.cards_one_stop_shop.security;

import apatel.learning.com.cards_one_stop_shop.entity.UserMgmt;
import apatel.learning.com.cards_one_stop_shop.repository.UserMgmtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserMgmtRepository userMgmtRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserMgmt user = userMgmtRepository.findByUserName(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found: " + username));
                
        return new org.springframework.security.core.userdetails.User(
                user.getUserName(),
                user.getUserPassword(),
                List.of(new SimpleGrantedAuthority("ROLE_" + user.getUserRole()))
        );
    }
}

