package com.team.snackpedia.repository;

import com.team.snackpedia.model.Allergy;
import com.team.snackpedia.model.Snack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SnackRepository extends JpaRepository<Snack, Long> {
  List<Snack> findAllBySnackName(String search);
  List<Snack> findAllByCategory(String category);

  Optional<Snack> findById(Long id);
}
