package se0867.adb.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se0867.adb.dao.impl.JobDaoImpl;
import se0867.adb.model.Job;
import se0867.adb.service.IJobManager;

@Service
public class JobManager implements IJobManager {
	
	@Autowired
	private JobDaoImpl jobDao;
	
	@Transactional
	@Override
	public boolean insertJob(Job job) {
		// TODO Auto-generated method stub
		return jobDao.insertJob(job);
	}

}
