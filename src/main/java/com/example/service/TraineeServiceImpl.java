package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.TraineeDao;
import com.example.model.Trainee;


@Component("traineeService")
@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {

	@Autowired
	TraineeDao traineeDao;
	@Override
	public int addTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return traineeDao.addTrainee(trainee);
	}

	@Override
	public int modifyTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return traineeDao.modifyTrainee(trainee);
	}

	@Override
	public int deleteTrainee(int id) {
		// TODO Auto-generated method stub
		return traineeDao.deleteTrainee(id);
	}

	@Override
	public Trainee getById(int id) {
		// TODO Auto-generated method stub
		return traineeDao.getById(id);
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return traineeDao.getAll();
	}

}
