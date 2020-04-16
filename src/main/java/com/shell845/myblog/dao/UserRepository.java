package com.shell845.myblog.dao;

import com.shell845.myblog.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author ych
 * @date 15/4/2020 11:57 PM
 */

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsernameAndPassword(String username, String password);
}
