package com.framework.core.querybuilder.hql.model.sort;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;


/**
 * 功能:
 * @author yuyang
 * @version 1.0
 * @since Jun 6, 20093:22:20 PM
 */
public class SortCriterion implements Serializable {
	public static final String ASCENDING = "asc";
	public static final String DESCENDING = "desc";
	
	/**
	 * sort field.
	 * must be consistent with hql's query string
	 */
	private String field;
	
	/**
	 * asc or desc. Default desc
	 */
	private String order; // values: asc desc

	/**
	 * Default DESCENDING
	 */
	public SortCriterion() {
		order = DESCENDING;
        field = "";
	}
	
	/**
	 * order default value: DESCENDING
	 * @param field
	 */
	public SortCriterion(String field) {
        this.field = field;
        order = DESCENDING;
	}
	
	public SortCriterion(String field, String order) {
		setField(field);
		setOrder(order);
	}
	
	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = StringUtils.isBlank(field) ? "" : field;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = ASCENDING.indexOf(order.toLowerCase().trim()) > -1
				   ? ASCENDING
		           : DESCENDING;
	}
	
	public boolean isAscending() {
		return ASCENDING.indexOf(order.toLowerCase().trim()) > -1;
	}

	public String toString() {
		return "SortCriterion[field=" + field
			+ ", order=" + order
			+ "]";
	}
	
}
