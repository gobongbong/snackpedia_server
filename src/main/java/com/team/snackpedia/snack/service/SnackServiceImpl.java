package com.team.snackpedia.snack.service;

import com.team.snackpedia.model.Snack;
import com.team.snackpedia.repository.AllergyRepository;
import com.team.snackpedia.repository.SnackRepository;
import com.team.snackpedia.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@Transactional
@Service
public class SnackServiceImpl implements SnackService {
  @Autowired
  SnackRepository snackRepository;

  @Autowired
  AllergyRepository allergyRepository;

  @Autowired
  TagRepository tagRepository;

  @Override
  public List<Snack> getAllSnack() {
    return snackRepository.findAll();
  }

  @Override
  public List<Snack> getSnackCategory(String category) {
    return snackRepository.findAllByCategory(category);
  }

  @Override
  public List<Snack> getSearchSnack(String search) {
    return snackRepository.findAllBySnackName(search);
  }

  @Override
  public Snack postSnack(Map<String, Object> data) {
//     먼저 One To One 해야 하나?
//     ManyToOne 아니라서 누가 먼저 해도 상관없을듯

//    파일 업로드도 여기서 구현

    Snack snack = new Snack();

    return snackRepository.save(snack);
  }
}
