package com.likelion.springbootboard.repo;

import com.likelion.springbootboard.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BoardRepo extends JpaRepository<Board,Long> {
}
