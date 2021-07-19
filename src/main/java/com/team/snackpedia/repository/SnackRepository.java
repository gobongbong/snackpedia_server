package com.team.snackpedia.repository;

import com.team.snackpedia.model.Allergy;
import com.team.snackpedia.model.Snack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SnackRepository extends JpaRepository<Snack, Long> {
}
