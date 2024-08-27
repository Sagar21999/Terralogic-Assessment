package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Node;

public interface NodeService {

	Node saveNode(Node node);
	List<Node> getAllNodes();
	Node getNodeByID(String node_id);
}
