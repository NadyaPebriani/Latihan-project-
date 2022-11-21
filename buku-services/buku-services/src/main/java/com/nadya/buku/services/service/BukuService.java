/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nadya.buku.services.service;

import com.nadya.buku.services.entity.Buku;
import com.nadya.buku.services.repository.BukuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author win 11
 */
@Service
public class BukuService {
    @Autowired
    private BukuRepository bukuRepository;
    
    public Buku saveBuku(Buku buku){
        return bukuRepository.save(buku);
    }
    
    public Buku findBukuById(Long bukuId){
        return bukuRepository.findByBukuId(bukuId);
    }
}
