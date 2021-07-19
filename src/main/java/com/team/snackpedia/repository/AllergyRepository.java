package com.team.snackpedia.repository;

import com.team.snackpedia.model.Allergy;
import com.team.snackpedia.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllergyRepository extends JpaRepository<Allergy, Long> {
}
