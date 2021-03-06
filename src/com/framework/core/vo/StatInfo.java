/**
 * 
 */
package com.framework.core.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Map;

/**
 * @author zengyunfeng
 * @version 1.0.0
 *
 */
public class StatInfo implements Serializable {

	/**
	 * 展现数
	 */
	long pv;
	/**
	 * 点击数
	 */
	long click;
	/**
	 * 点击率
	 */
	double rate;
	/**
	 * 平均每次点击价格
	 */
	double cp;
	/**
	 * 平均千次展现价格
	 */
	double kvp;
	/**
	 * 总费用
	 */
	double cost;
	

	
	public StatInfo() {
		
	}
	/**
	 * @return the pv
	 */
	public long getPv() {
		return pv;
	}
	/**
	 * @param pv the pv to set
	 */
	public void setPv(long preCount) {
		this.pv = preCount;
	}
	/**
	 * @return the click
	 */
	public long getClick() {
		return click;
	}
	/**
	 * @param click the click to set
	 */
	public void setClick(long clkCount) {
		this.click = clkCount;
	}
	/**
	 * @return the rate
	 */
	public double getRate() {
		return rate;
	}
	/**
	 * @param rate the rate to set
	 */
	public void setRate(double clkPerPre) {
		this.rate = clkPerPre;
	}
	/**
	 * @return the cp
	 */
	public double getCp() {
		return cp;
	}
	/**
	 * @param cp the cp to set
	 */
	public void setCp(double priPerClk) {
		this.cp = priPerClk;
	}
	/**
	 * @return the kvp
	 */
	public double getKvp() {
		return kvp;
	}
	/**
	 * @param kvp the kvp to set
	 */
	public void setKvp(double priPerThdClk) {
		this.kvp = priPerThdClk;
	}
	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}
	/**
	 * @param cost the cost to set
	 */
	public void setCost(double fee) {
		this.cost = fee;
	}
	
}
