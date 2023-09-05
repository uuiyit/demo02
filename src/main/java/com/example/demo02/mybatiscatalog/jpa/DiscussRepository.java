package com.example.demo02.mybatiscatalog.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DiscussRepository extends JpaRepository<Discuss,Integer> {
    public List<Discuss> findByAuthorNotNull();

    @Query("select c from t_comment c where c.aId = ?1")
    public List<Discuss> getDiscussPaged

}
