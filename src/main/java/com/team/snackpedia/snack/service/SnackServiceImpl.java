package com.team.snackpedia.snack.service;

import com.team.snackpedia.model.Snack;
import com.team.snackpedia.repository.AllergyRepository;
import com.team.snackpedia.repository.SnackRepository;
import com.team.snackpedia.repository.TagRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.File;
import java.io.IOException;
import java.util.List;

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
    System.out.println(snackRepository.findAll());
    return snackRepository.findAll();
  }

  @Override
  public List<Snack> getSnackCategory(String category) {
    return snackRepository.findAllByCategory(category);
  }

  @Override
  public List<Snack> getSearchSnack(String search) {
    System.out.println("검색어 >>>> " + search);
    return snackRepository.findAllBySnackName(search);
  }


  @Override
  public String postSnack(Snack snack, MultipartFile file) throws IOException {
    String[] scores = {"repurchase", "satiety", "creativity", "costPerformance", "flavor"};
//    System.out.println(snack);
//    System.out.println(file.getOriginalFilename());

//  Set Radar Score
    snack.setRepurchase((int) (Math.random() * 5 + 1));
    snack.setSatiety((int) (Math.random() * 5 + 1));
    snack.setCreativity((int) (Math.random() * 5 + 1));
    snack.setCostPerformance((int) (Math.random() * 5 + 1));
    snack.setFlavor((int) (Math.random() * 5 + 1));

    System.out.println(snack.toString());

//  File 처리
    long time = System.currentTimeMillis();

    String originalName = file.getOriginalFilename();
    String prefix = originalName.substring(0, originalName.indexOf(".")); // 파일 이름
    String sufix = originalName.substring(originalName.indexOf(".")); // 확장자

    String savedFileName = prefix + "_" + time + sufix;

    snack.setSnackThumbnailPath(savedFileName);

    file.transferTo(new File("C:/Users/Admin/Desktop/Mini Project 2/Front/snackpedia-client/public/images/" + savedFileName));

    snackRepository.save(snack);

    return "1";
  }
}
