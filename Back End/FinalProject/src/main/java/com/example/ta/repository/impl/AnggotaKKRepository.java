package com.example.ta.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.ta.model.AnggotaKK;
import com.example.ta.repository.IAnggotaKKRepository;

@Repository
public class AnggotaKKRepository implements IAnggotaKKRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate; 
	
	@Override
	public AnggotaKK insertAnggotaKK(AnggotaKK anggotakk) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO tb_anggota_keluarga(agama, id_kk, jenis_kelamin, kepala_keluarga, nama, nik, pendidikan, tanggal_lahir, tempat_lahir) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(query, new Object[] {anggotakk.getAgama(), anggotakk.getId_kk(), anggotakk.getJenis_kelamin(), 
				anggotakk.getKepala_keluarga(), anggotakk.getNama(), anggotakk.getNik(), anggotakk.getPendidikan(), anggotakk.getTanggal_lahir(), anggotakk.getTempat_lahir()});
		return anggotakk;
	}

	@Override
	public List<AnggotaKK> getAllAnggotaKK() {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_anggota_keluarga";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(AnggotaKK.class));
	}

	@Override
	public AnggotaKK updateAnggotaKK(int id, AnggotaKK anggotakk) {
		// TODO Auto-generated method stub
		String query = "UPDATE tb_anggota_keluarga SET agama = ?, id_kk = ?, jenis_kelamin = ?, kepala_keluarga = ?, "
				+ "nama = ?, nik = ?, pendidikan = ?, tanggal_lahir = ?, tempat_lahir = ? WHERE id = ?";
		
		jdbcTemplate.update(query, new Object[] {anggotakk.getAgama(), anggotakk.getId_kk(), anggotakk.getJenis_kelamin(), 
				anggotakk.getKepala_keluarga(), anggotakk.getNama(), anggotakk.getNik(), anggotakk.getPendidikan(), anggotakk.getTanggal_lahir(), anggotakk.getTempat_lahir(), id});
		return anggotakk;
	}

	@Override
	public AnggotaKK deleteAnggotaKK(int id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_anggota_keluarga WHERE id = ?";
		var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(AnggotaKK.class), id);
		
		query = "DELETE FROM tb_anggota_keluarga WHERE id = ?";
		jdbcTemplate.update(query, id);
		
		return result;
	}

	@Override
	public AnggotaKK updateGetId(int id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_anggota_keluarga WHERE id = ?";
		var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(AnggotaKK.class), id);
		return result;
	}

	@Override
	public List<AnggotaKK> getAnggotaKK(int id_kk) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_anggota_keluarga WHERE id_kk = ?";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(AnggotaKK.class), id_kk);
	}

}
