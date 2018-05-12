package com.appleyk.node.relation;

import com.appleyk.node.RNode;
import com.appleyk.node.base.RObject;

/**
 * 边 == 关系
 * @author yukun24@126.com
 * @blob   http://blog.csdn.net/appleyk
 * @date   2018年5月12日-上午9:54:55
 */
public class REdge extends RObject{

	/**
	 * 关系的ID  ==  聚合、连接、属于、包括等，这些关系可能是枚举字典，因此记录关系ID是有必要的
	 */
	private Long relationID;
	
	/**
	 * 关系名称
	 */
	private String name;
	
	/**
	 * 关系指向哪一个节点 == 可能这个节点还有关系【节点关系递增下去】
	 */
	private RNode  rNode;
	
	public Long getRelationID() {
		return relationID;
	}

	public void setRelationID(Long relationID) {
		this.relationID = relationID;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public RNode getrNode() {
		return rNode;
	}

	public void setrNode(RNode rNode) {
		this.rNode = rNode;
	}
	
}
