package com.example.ta.repository;

import java.util.List;

import com.example.ta.model.KK;

public interface IKKRepository {
	public KK insertKK(KK kk);
	public List<KK> getAllKK();
	public KK updateKK(int id, KK kk);
	public KK deleteKK(int id);
	public KK updateGetId(int id);
}
