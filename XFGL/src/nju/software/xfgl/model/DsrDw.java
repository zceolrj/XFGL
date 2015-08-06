package nju.software.xfgl.model;

// Generated 2014-7-21 0:36:58 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * DsrDw generated by hbm2java
 */
public class DsrDw implements java.io.Serializable 
{
	private static final long serialVersionUID = 1L;
	
	private Integer ajxh;
	
	private Integer dsrbh;
	
	private String dwmc;
	private String dz;
	private String dh;
	private String yb;
	private String frxz;
	private String gyqygm;
	private String fddbrxm;
	private String fddbrxb;
	private Date csnyr;
	private String whcd;
	private String zzmm;
	private String jb;
	private String zw;
	private String dbrzw;
	private String lxdh;
	private String djzlb;
	private String djzh;
	private String djzlbA;
	private String djzhA;
	private String djzlbB;
	private String djzhB;
	private String djzlbC;
	private String djzhC;
	private String djzlbE;
	private String djzhE;
	private int symbol;

	public DsrDw() {
	}

	public DsrDw(Integer ajxh, Integer dsrbh, int symbol) {
		this.ajxh = ajxh;
		this.dsrbh = dsrbh;
		this.symbol = symbol;
	}

	public DsrDw(Integer ajxh, Integer dsrbh, String dwmc, String dz, String dh, String yb,
			String frxz, String gyqygm, String fddbrxm, String fddbrxb,
			Date csnyr, String whcd, String zzmm, String jb, String zw,
			String dbrzw, String lxdh, String djzlb, String djzh,
			String djzlbA, String djzhA, String djzlbB, String djzhB,
			String djzlbC, String djzhC, String djzlbE, String djzhE, int symbol) {
		this.ajxh = ajxh;
		this.dsrbh = dsrbh;
		this.dwmc = dwmc;
		this.dz = dz;
		this.dh = dh;
		this.yb = yb;
		this.frxz = frxz;
		this.gyqygm = gyqygm;
		this.fddbrxm = fddbrxm;
		this.fddbrxb = fddbrxb;
		this.csnyr = csnyr;
		this.whcd = whcd;
		this.zzmm = zzmm;
		this.jb = jb;
		this.zw = zw;
		this.dbrzw = dbrzw;
		this.lxdh = lxdh;
		this.djzlb = djzlb;
		this.djzh = djzh;
		this.djzlbA = djzlbA;
		this.djzhA = djzhA;
		this.djzlbB = djzlbB;
		this.djzhB = djzhB;
		this.djzlbC = djzlbC;
		this.djzhC = djzhC;
		this.djzlbE = djzlbE;
		this.djzhE = djzhE;
		this.symbol = symbol;
	}

	public Integer getAjxh() {
		return ajxh;
	}

	public void setAjxh(Integer ajxh) {
		this.ajxh = ajxh;
	}

	public Integer getDsrbh() {
		return dsrbh;
	}

	public void setDsrbh(Integer dsrbh) {
		this.dsrbh = dsrbh;
	}

	public String getDwmc() {
		return this.dwmc;
	}

	public void setDwmc(String dwmc) {
		this.dwmc = dwmc;
	}

	public String getDz() {
		return this.dz;
	}

	public void setDz(String dz) {
		this.dz = dz;
	}

	public String getDh() {
		return this.dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
	}

	public String getYb() {
		return this.yb;
	}

	public void setYb(String yb) {
		this.yb = yb;
	}

	public String getFrxz() {
		return this.frxz;
	}

	public void setFrxz(String frxz) {
		this.frxz = frxz;
	}

	public String getGyqygm() {
		return this.gyqygm;
	}

	public void setGyqygm(String gyqygm) {
		this.gyqygm = gyqygm;
	}

	public String getFddbrxm() {
		return this.fddbrxm;
	}

	public void setFddbrxm(String fddbrxm) {
		this.fddbrxm = fddbrxm;
	}

	public String getFddbrxb() {
		return this.fddbrxb;
	}

	public void setFddbrxb(String fddbrxb) {
		this.fddbrxb = fddbrxb;
	}

	public Date getCsnyr() {
		return this.csnyr;
	}

	public void setCsnyr(Date csnyr) {
		this.csnyr = csnyr;
	}

	public String getWhcd() {
		return this.whcd;
	}

	public void setWhcd(String whcd) {
		this.whcd = whcd;
	}

	public String getZzmm() {
		return this.zzmm;
	}

	public void setZzmm(String zzmm) {
		this.zzmm = zzmm;
	}

	public String getJb() {
		return this.jb;
	}

	public void setJb(String jb) {
		this.jb = jb;
	}

	public String getZw() {
		return this.zw;
	}

	public void setZw(String zw) {
		this.zw = zw;
	}

	public String getDbrzw() {
		return this.dbrzw;
	}

	public void setDbrzw(String dbrzw) {
		this.dbrzw = dbrzw;
	}

	public String getLxdh() {
		return this.lxdh;
	}

	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}

	public String getDjzlb() {
		return this.djzlb;
	}

	public void setDjzlb(String djzlb) {
		this.djzlb = djzlb;
	}

	public String getDjzh() {
		return this.djzh;
	}

	public void setDjzh(String djzh) {
		this.djzh = djzh;
	}

	public String getDjzlbA() {
		return this.djzlbA;
	}

	public void setDjzlbA(String djzlbA) {
		this.djzlbA = djzlbA;
	}

	public String getDjzhA() {
		return this.djzhA;
	}

	public void setDjzhA(String djzhA) {
		this.djzhA = djzhA;
	}

	public String getDjzlbB() {
		return this.djzlbB;
	}

	public void setDjzlbB(String djzlbB) {
		this.djzlbB = djzlbB;
	}

	public String getDjzhB() {
		return this.djzhB;
	}

	public void setDjzhB(String djzhB) {
		this.djzhB = djzhB;
	}

	public String getDjzlbC() {
		return this.djzlbC;
	}

	public void setDjzlbC(String djzlbC) {
		this.djzlbC = djzlbC;
	}

	public String getDjzhC() {
		return this.djzhC;
	}

	public void setDjzhC(String djzhC) {
		this.djzhC = djzhC;
	}

	public String getDjzlbE() {
		return this.djzlbE;
	}

	public void setDjzlbE(String djzlbE) {
		this.djzlbE = djzlbE;
	}

	public String getDjzhE() {
		return this.djzhE;
	}

	public void setDjzhE(String djzhE) {
		this.djzhE = djzhE;
	}

	public int getSymbol() {
		return this.symbol;
	}

	public void setSymbol(int symbol) {
		this.symbol = symbol;
	}

}