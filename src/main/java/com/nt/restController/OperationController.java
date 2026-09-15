package com.nt.restController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.enttity.Tree;
import com.nt.service.IService;
@RestController
@RequestMapping("/push")
public class OperationController {
	@Autowired
     private IService serv;
	@PostMapping("/sendTree")
	public ResponseEntity<Tree> storeData(@RequestBody Tree tree){
		 Tree saveData = serv.saveData(tree);
		return new ResponseEntity<>(saveData,HttpStatus.CREATED);
	}
}
