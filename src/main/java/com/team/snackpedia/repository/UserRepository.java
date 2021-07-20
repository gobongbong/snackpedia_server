package com.team.snackpedia.repository;

import com.team.snackpedia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//    Optional<User> findByUserEmailAndUserPassword(String userEmail, String userPassword);
//    boolean existsByUserEmail(String userEmail);
//    //boolean???? 이거 왜 쓰지..?ㅠ
//    User findByUserEmail(String userEmail);
}