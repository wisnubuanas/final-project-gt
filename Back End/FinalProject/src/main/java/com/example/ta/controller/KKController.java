package com.example.ta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ta.model.KK;
import com.example.ta.service.IKKService;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api/kk")

public class KKController {

	@Autowired
	IKKService kkService;
	
	@PostMapping("/insert")
	public KK insertKK(@RequestBody KK kk){
		return kkService.insertKK(kk);
	}
	
	@GetMapping("/getAll")
	public List<KK> getAllKK(){
		return kkService.getAllKK();
	}
	
	@PutMapping("/update/{id}")
	public KK updateKK(@PathVariable int id, @RequestBody KK kk) {
		return kkService.updateKK(id, kk);
	}
	
	@DeleteMapping("/delete/{id}")
	public KK deleteKK(@PathVariable int id) {
		return kkService.deleteKK(id);
	}
	@GetMapping("/updateGetId/{id}")
	public KK updateGetId(@PathVariable int id) {
		return kkService.updateGetId(id);
	}
}
