package com.appleyk.node;

import com.appleyk.node.base.RObject;
import com.appleyk.node.relation.REdge;

/**
 * 节点
 * @author yukun24@126.com
 * @blob   http://blog.csdn.net/appleyk
 * @date   2018年5月12日-下午1:58:59
 */
public class RNode extends RObject{
    
	/**
	 * 节点的uuid == 对应其他数据库中的主键
	 */
	private Long uuid;
	
	/**
	 * 节点里面是否包含有边 == 关系
	 */
	private REdge edge;

	public Long getUuid() {
		return uuid;
	}

	public void setUuid(Long uuid) {
		this.uuid = uuid;
	}

	public REdge getEdge() {
		return edge;
	}

	public void setEdge(REdge edge) {
		this.edge = edge;
	}
}
