package com.appleyk.node.base;

import java.util.HashMap;
import java.util.Map;

/**
 * 节点和关系对象的基类，含公共部分的id、标签label以及属性properties
 * @author yukun24@126.com
 * @blob   http://blog.csdn.net/appleyk
 * @date   2018年5月12日-上午9:55:19
 */
public class RObject {


	/**
	 * 节点标签名称 == Node Labels
	 */
	private String label;
	
	/**
	 * 节点属性键值对 == Property Keys
	 */
    private Map<String, Object> properties;
    
    
    public RObject(){
    	properties = new HashMap<>();
    }
    

	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Map<String, Object> getProperties() {
		return properties;
	}
	
	/**
	 * 添加属性
	 * @param key
	 * @param value
	 */
	public void addProperty(String key,Object value){
		properties.put(key, value);
	}
	
	/**
	 * 拿到属性
	 * @param key
	 * @return
	 */
	public Object getProperty(String key){
		return properties.get(key);
	}
	/**
	 * 移除属性
	 * @param key
	 */
	public void removeProperty(String key){
		properties.remove(key);
	}
	
	public void setProperties(Map<String, Object> properties) {
		this.properties = properties;
	}
}
