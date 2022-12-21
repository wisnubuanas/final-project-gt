package com.example.ta.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ta.model.AnggotaKK;

@Service
public interface IAnggotaKKService {
	public AnggotaKK insertAnggotaKK(AnggotaKK anggotakk);
	public List<AnggotaKK> getAllAnggotaKK();
	public AnggotaKK updateAnggotaKK(int id, AnggotaKK anggotakk);
	public AnggotaKK deleteAnggotaKK(int id);
	public AnggotaKK updateGetId(int id);
	public List<AnggotaKK> getAnggotaKK(int id_kk);
}
