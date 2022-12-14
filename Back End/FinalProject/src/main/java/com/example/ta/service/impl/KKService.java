package com.example.ta.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ta.model.KK;
import com.example.ta.repository.IKKRepository;
import com.example.ta.service.IKKService;

@Service
public class KKService implements IKKService {
	
	@Autowired
	IKKRepository kkRepository;

	@Override
	public KK insertKK(KK kk) {
		// TODO Auto-generated method stub
		return kkRepository.insertKK(kk);
	}

	@Override
	public List<KK> getAllKK() {
		// TODO Auto-generated method stub
		return kkRepository.getAllKK();
	}

	@Override
	public KK updateKK(int id, KK kk) {
		// TODO Auto-generated method stub
		return kkRepository.updateKK(id, kk);
	}

	@Override
	public KK deleteKK(int id) {
		// TODO Auto-generated method stub
		return kkRepository.deleteKK(id);
	}

	@Override
	public KK updateGetId(int id) {
		// TODO Auto-generated method stub
		return kkRepository.updateGetId(id);
	}

}
