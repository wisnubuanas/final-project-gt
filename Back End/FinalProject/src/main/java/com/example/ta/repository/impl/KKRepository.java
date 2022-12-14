package com.example.ta.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.ta.model.KK;
import com.example.ta.repository.IKKRepository;

@Repository
public class KKRepository implements IKKRepository {

	@Autowired
	JdbcTemplate jdbcTemplate; 
	
	@Override
	public KK insertKK(KK kk) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO tb_kartu_keluarga(alamat, desa_kelurahan, kabupaten_kota, kecamatan, kode_pos, nomor_kk, provinsi, rt, rw) "
				+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(query, new Object[] {kk.getAlamat(), kk.getDesa_kelurahan(), kk.getKabupaten_kota(), kk.getKecamatan(), kk.getKode_pos(), kk.getNomor_kk(), kk.getProvinsi(), kk.getRt(), kk.getRw()});
		return kk;
	}

	@Override
	public List<KK> getAllKK() {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_kartu_keluarga";
		return jdbcTemplate.query(query, new BeanPropertyRowMapper<>(KK.class));
	}

	@Override
	public KK updateKK(int id, KK kk) {
		// TODO Auto-generated method stub
		String query = "UPDATE tb_kartu_keluarga SET alamat = ?, desa_kelurahan = ?, kabupaten_kota = ?, kecamatan = ?, "
				+ "kode_pos = ?, nomor_kk = ?, provinsi = ?, rt = ?, rw = ? WHERE id = ?";
		
		jdbcTemplate.update(query, new Object[] {kk.getAlamat(), kk.getDesa_kelurahan(), kk.getKabupaten_kota(), kk.getKecamatan(), kk.getKode_pos(), kk.getNomor_kk(), kk.getProvinsi(), kk.getRt(), kk.getRw(), id});
	
		return kk;
	}

	@Override
	public KK deleteKK(int id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_kartu_keluarga WHERE id = ?";
		var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(KK.class), id);
		
		query = "DELETE FROM tb_kartu_keluarga WHERE id = ?";
		jdbcTemplate.update(query, id);
		
		return result;
	}

	@Override
	public KK updateGetId(int id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM tb_kartu_keluarga WHERE id = ?";
		var result = jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<>(KK.class), id);
		return result;
	}

}
