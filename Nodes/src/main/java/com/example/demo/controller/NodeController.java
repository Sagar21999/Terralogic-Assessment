package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Node;
import com.example.demo.service.NodeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/nodes")
public class NodeController {
	
	private NodeService nodeService;

	public NodeController(NodeService nodeService) {
		super();
		this.nodeService = nodeService;
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping
	public ResponseEntity<String> saveNode(@Valid @RequestBody Node node,BindingResult bindingResult){
		if(bindingResult.hasErrors()) {
			return new ResponseEntity<>(bindingResult.getAllErrors().get(0).getDefaultMessage(),HttpStatus.BAD_REQUEST);
		}
		Node n = nodeService.saveNode(node);
		if(n!=null) {
			return ResponseEntity.ok("Node has been created");

		}else {
			return (ResponseEntity<String>) ResponseEntity.internalServerError();
		}
	}
	
	@GetMapping
	public List<Node> getNodes(){
		return nodeService.getAllNodes();
	}
	
	@GetMapping("{node_id}")
	public ResponseEntity<Node> getNodeById(@PathVariable("node_id")String node_id) {
		return new ResponseEntity<Node>(nodeService.getNodeByID(node_id), HttpStatus.OK);
	}

}
