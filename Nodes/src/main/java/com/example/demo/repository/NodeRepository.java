package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.Node;
public interface NodeRepository extends JpaRepository<Node, String> {

}
