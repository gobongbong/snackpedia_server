package com.team.snackpedia.snack.controller;

import com.team.snackpedia.model.Snack;
import com.team.snackpedia.snack.service.SnackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class SnackController {
@Autowired
  SnackService snackService;

//  랜딩 페이지 모든 과자 출력
  @CrossOrigin("*")
  @GetMapping("/")
  public List<Snack> getAllSnack() {
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
  public void postSnack(@RequestBody Map<String, Object> data) {
    System.out.println(data);
    //    return snackService.postSnack(data);
  }
}
