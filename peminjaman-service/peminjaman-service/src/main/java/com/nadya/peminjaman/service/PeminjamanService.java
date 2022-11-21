/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nadya.peminjaman.service;

import com.nadya.peminjaman.VO.Anggota;
import com.nadya.peminjaman.VO.ResponseTemplateVO;
import com.nadya.peminjaman.entity.Peminjaman;
import com.nadya.peminjaman.repository.PeminjamanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author win 11
 */
@Service
public class PeminjamanService {
    @Autowired
    private PeminjamanRepository peminjamanRepository;
    
    @Autowired
    private RestTemplate restTemplate;
    
    public Peminjaman savePeminjaman(Peminjaman peminjaman){
        return peminjamanRepository.save(peminjaman);
    }
    
    public ResponseTemplateVO getPeminjaman(Long peminjamanId){
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Peminjaman peminjaman = 
                peminjamanRepository.findByPeminjamanId(peminjamanId);
        Anggota anggota = 
        restTemplate.getForObject("http://localhost:9001/anggota/"
                + peminjaman.getAnggotaId(), Anggota.class);
        vo.setPeminjaman(peminjaman);
        vo.setAnggota(anggota); 
        return vo;
    }
    
}
