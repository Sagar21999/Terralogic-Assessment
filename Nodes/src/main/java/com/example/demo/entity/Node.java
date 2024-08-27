package com.example.demo.entity;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="Nodes")
public class Node {

	@Id
	@Column(name="node_id",nullable=false)
	@NotNull(message="Node Id cannot be Null")
//    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Special characters are not allowed")
	private String node_id;
	
//	@Transient
//    private static final AtomicInteger counter = new AtomicInteger(1);
//
//    @PrePersist
//    private void generateNodeId() {
//        this.node_id = String.format("T300_%03d", counter.getAndIncrement());
//    }
    
	@Column(name="node_name",nullable=false)
	@NotNull(message="Name cannot be Null")
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Special characters are not allowed")
	private String node_name;
	
	@Column(name="description",nullable=false)
	@NotNull(message="description cannot be Null")
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Special characters are not allowed")
	private String description;
	
	@Column(name="memo",nullable=false)
	@NotNull(message="memo cannot be Null")
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Special characters are not allowed")
	private String memo;
	
	@Column(name="node_type",nullable=false)
	@NotNull(message="type cannot be Null")
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Special characters are not allowed")
	private String node_type;
	
	@Column(name="parent_node_group_name",nullable=false)
	@NotNull(message="parent group name cannot be Null")
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Special characters are not allowed")
	private String parent_node_group_name;
	
	@Column(name="parent_node_group_id",nullable=false)
	@NotNull(message="parent group id cannot be Null")
    @Pattern(regexp = "^[a-zA-Z0-9 ]*$", message = "Special characters are not allowed")
	private String parent_node_group_id;

	public String getNode_id() {
		return node_id;
	}

	public void setNode_id(String node_id) {
		this.node_id = node_id;
	}

	public String getNode_name() {
		return node_name;
	}

	public void setNode_name(String node_name) {
		this.node_name = node_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getNode_type() {
		return node_type;
	}

	public void setNode_type(String node_type) {
		this.node_type = node_type;
	}

	public String getParent_node_group_name() {
		return parent_node_group_name;
	}

	public void setParent_node_group_name(String parent_node_group_name) {
		this.parent_node_group_name = parent_node_group_name;
	}

	public String getParent_node_group_id() {
		return parent_node_group_id;
	}

	public void setParent_node_group_id(String parent_node_group_id) {
		this.parent_node_group_id = parent_node_group_id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(description, memo, node_id, node_name, node_type, parent_node_group_id,
				parent_node_group_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		return Objects.equals(description, other.description) && Objects.equals(memo, other.memo)
				&& Objects.equals(node_id, other.node_id) && Objects.equals(node_name, other.node_name)
				&& Objects.equals(node_type, other.node_type)
				&& Objects.equals(parent_node_group_id, other.parent_node_group_id)
				&& Objects.equals(parent_node_group_name, other.parent_node_group_name);
	}

	@Override
	public String toString() {
		return "Node [node_id=" + node_id + ", node_name=" + node_name + ", description=" + description + ", memo="
				+ memo + ", node_type=" + node_type + ", parent_node_group_name=" + parent_node_group_name
				+ ", parent_node_group_id=" + parent_node_group_id + "]";
	}
	
	
}
