/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.nadya.buku.services.repository;

import com.nadya.buku.services.entity.Buku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author win 11
 */
@Repository
public interface BukuRepository extends JpaRepository<Buku, Long> {
     public Buku findByBukuId(Long bukuId);
}
