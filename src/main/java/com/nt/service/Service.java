package com.nt.service;
import org.springframework.beans.factory.annotation.Autowired;
import com.nt.enttity.Tree;
import com.nt.repository.IRepository;
@org.springframework.stereotype.Service
public class Service implements IService {
	@Autowired
	private IRepository repo;
	@Override
	public Tree saveData(Tree tree) {
		return repo.save(tree);
	}
}
