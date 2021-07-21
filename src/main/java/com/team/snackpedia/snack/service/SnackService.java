package com.team.snackpedia.snack.service;

import com.team.snackpedia.model.Snack;

import java.util.List;
import java.util.Map;

public interface SnackService {
  List<Snack> getAllSnack();
  List<Snack> getSnackCategory(String category);
  List<Snack> getSearchSnack(String search);
  Snack postSnack(Map<String, Object> data);
}
