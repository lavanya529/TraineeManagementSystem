package com.example.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.model.Trainee;


@Component("traineeDao")
@Repository
public class TraineeDaoImpl implements TraineeDao {
	@PersistenceContext
	EntityManager entityManager;
	@Override
	public int addTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		entityManager.persist(trainee);
		return 1;
	}

	@Override
	public int modifyTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		entityManager.merge(trainee);
		return 1;
	}

	@Override
	public int deleteTrainee(int id) {
		// TODO Auto-generated method stub
		Trainee t = entityManager.find(Trainee.class, id);
		entityManager.remove(t);
		return 1;
	}

	@Override
	public Trainee getById(int id) {
		// TODO Auto-generated method stub
		Trainee t = entityManager.find(Trainee.class, id);
		return t;
	}

	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("from Trainee");
		List list = query.getResultList();
		return list;
	}

}
