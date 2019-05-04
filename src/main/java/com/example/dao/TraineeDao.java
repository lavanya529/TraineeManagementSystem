package com.example.dao;

import java.util.List;

import com.example.model.Trainee;

public interface TraineeDao {
	int addTrainee(Trainee trainee);
	int modifyTrainee(Trainee trainee);
	int deleteTrainee(int id);
	Trainee getById(int id);
	List getAll();
}
