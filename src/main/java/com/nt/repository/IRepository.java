package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nt.enttity.Tree;
@Repository
public interface IRepository  extends JpaRepository<Tree,Integer>{

}
