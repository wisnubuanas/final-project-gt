package com.example.ta.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ta.model.KK;

@Service
public interface IKKService {
	public KK insertKK(KK kk);
	public List<KK> getAllKK();
	public KK updateKK(int id, KK kk);
	public KK deleteKK(int id);
	public KK updateGetId(int id);
}
