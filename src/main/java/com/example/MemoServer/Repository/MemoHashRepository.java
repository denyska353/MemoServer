package com.example.MemoServer.Repository;

import com.example.MemoServer.Models.MemoHash;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MemoHashRepository extends CrudRepository<MemoHash,Long>{
    List<MemoHash> getAllByHash0OrHash1OrHash2OrHash3OrHash4OrHash5OrHash6OrHash7OrHash8OrHash9OrHash10OrHash11OrHash12OrHash13OrHash14OrHash15(String hash0,String hash1,String hash2,String hash3,String hash4,String hash5,String hash6,String hash7,String hash8,String hash9,String hash10,String hash11,String hash12,String hash13,String hash14,String hash15);
  //  List<MemoHash> findDistinctByHash0OrHash1EqualsOrHash2EqualsOrHash3EqualsOrHash4EqualsOrHash5Equals(String hash0,String hash1,String hash2,String hash3,String hash4,String hash5);


   //Iterable<MemoHash> g findAllBy();
}
