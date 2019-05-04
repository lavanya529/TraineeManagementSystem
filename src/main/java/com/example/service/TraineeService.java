package com.example.service;

import java.util.List;

import com.example.model.Trainee;

public interface TraineeService {
	int addTrainee(Trainee trainee);
	int modifyTrainee(Trainee trainee);
	int deleteTrainee(int id);
	Trainee getById(int id);
	List getAll();
}
