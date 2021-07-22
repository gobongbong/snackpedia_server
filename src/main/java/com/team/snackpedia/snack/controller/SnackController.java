package com.team.snackpedia.snack.controller;

import com.team.snackpedia.model.Snack;
import com.team.snackpedia.model.User;
import com.team.snackpedia.repository.SnackRepository;
import com.team.snackpedia.snack.service.SnackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@RestController
public class SnackController {
  @Autowired
  SnackService snackService;

  // 임시 Repository
  @Autowired
  SnackRepository snackRepository;

  //  랜딩 페이지 모든 과자 출력
  @CrossOrigin("*")
  @GetMapping("/")
  public List<Snack> getAllSnack() {
    System.out.println(snackService.getAllSnack());
    return snackService.getAllSnack();
  }

  //   카테고리별 과자 리스트 return
  @CrossOrigin("*")
  @GetMapping("/snack/{category}")
  public List<Snack> getSnackCategory(@PathVariable String category) {
    System.out.println("선택한 카테고리 >>>> " + category);
    return snackService.getSnackCategory(category);
  }

  //   검색어에 포함되는 모든 과자 리스트 출력
  @CrossOrigin("*")
  @GetMapping("/search")
  public List<Snack> testSnackSearch(@RequestParam String search) {
    return snackService.getSearchSnack(search);
  }

  //   과자 등록
  @CrossOrigin("*")
  @PostMapping("snack/regist")
  public String postSnack(@ModelAttribute Snack snack, @RequestPart("file") MultipartFile file) throws IOException {
    return snackService.postSnack(snack, file);
  }

  //  임시 과자 등록 API
  @CrossOrigin("*")
  @PostMapping("/comment/asdasdasdasda")
//  public String postCommet(Snack snack) {
  public String postCommet(@ModelAttribute Snack snack, @RequestPart("file") MultipartFile file) {

    System.out.println("과자 등록 정보 >>> " + snack);
//    System.out.println("과자 등록 정보 >>> " + snackName);

//    문제점 2. Snack 정보와 함께 이미지도 같이 받아올려면 파라미터에 어떻게 써야하는지

//    궁금증 findAllBySnackName을 하면 찾고자 하는 글자가 있는 것들은 전부 다 들고 오는지
//    e.g, 꼬깔콘 검색을 하면 [꼬깔콘], [꼬깔콘블랙], [꼬깔콘 레인보우] 다 받아오는지


    return "1";
  }
}
