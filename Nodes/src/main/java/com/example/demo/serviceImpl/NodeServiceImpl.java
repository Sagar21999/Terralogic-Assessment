package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Node;
import com.example.demo.exception.NodeNotFoundException;
import com.example.demo.repository.NodeRepository;
import com.example.demo.service.NodeService;

@Service
public class NodeServiceImpl implements NodeService {
	
	private NodeRepository nodeRepository;

	public NodeServiceImpl(NodeRepository nodeRepository) {
		super();
		this.nodeRepository = nodeRepository;
	}

	@Override
	public Node saveNode(Node node) {
		return nodeRepository.save(node);
	}

	@Override
	public List<Node> getAllNodes() {
		return nodeRepository.findAll();
	}

	@Override
	public Node getNodeByID(String node_id) {
		Optional<Node> node = nodeRepository.findById(node_id);
		if(node.isPresent()) {
			return node.get();
		}
		else {
			throw new NodeNotFoundException("Cannot find node with id : " + node_id);

		}
	}

}
