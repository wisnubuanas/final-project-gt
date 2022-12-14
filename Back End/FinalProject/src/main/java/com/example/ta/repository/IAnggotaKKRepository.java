package com.example.ta.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.ta.model.AnggotaKK;

@Repository
public interface IAnggotaKKRepository {
	public AnggotaKK insertAnggotaKK(AnggotaKK anggotakk);
	public List<AnggotaKK> getAllAnggotaKK();
	public AnggotaKK updateAnggotaKK(int id, AnggotaKK anggotakk);
	public AnggotaKK deleteAnggotaKK(int id);
	public AnggotaKK updateGetId(int id);
	public List<AnggotaKK> getAnggotaKK(int id_kk);
}
