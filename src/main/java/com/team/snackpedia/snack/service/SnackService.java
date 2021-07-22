package com.team.snackpedia.snack.service;

import com.team.snackpedia.model.Snack;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface SnackService {
  List<Snack> getAllSnack();
  List<Snack> getSnackCategory(String category);
  List<Snack> getSearchSnack(String search);
  String postSnack(Snack snack, MultipartFile file) throws IOException;
}
