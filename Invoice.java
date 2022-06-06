package com.highradius.web.model;

public class Invoice {
	public Integer getSl_no() {
		return sl_no;
	}
	public void setSl_no(Integer sl_no) {
		this.sl_no = sl_no;
	}
	public String getBusiness_code() {
		return business_code;
	}
	public void setBusiness_code(String business_code) {
		this.business_code = business_code;
	}
	public Integer getCust_number() {
		return cust_number;
	}
	public void setCust_number(Integer cust_number) {
		this.cust_number = cust_number;
	}
	public String getName_customer() {
		return name_customer;
	}
	public void setName_customer(String name_customer) {
		this.name_customer = name_customer;
	}
	public String getClear_date() {
		return clear_date;
	}
	public void setClear_date(String clear_date) {
		this.clear_date = clear_date;
	}
	public Float getBuisness_year() {
		return buisness_year;
	}
	public void setBuisness_year(Float buisness_year) {
		this.buisness_year = buisness_year;
	}
	public String getDoc_id() {
		return doc_id;
	}
	public void setDoc_id(String doc_id) {
		this.doc_id = doc_id;
	}
	public String getPosting_date() {
		return posting_date;
	}
	public void setPosting_date(String posting_date) {
		this.posting_date = posting_date;
	}
	public String getDocument_create_date() {
		return document_create_date;
	}
	public void setDocument_create_date(String document_create_date) {
		this.document_create_date = document_create_date;
	}
	public String getDocument_create_date1() {
		return document_create_date1;
	}
	public void setDocument_create_date1(String document_create_date1) {
		this.document_create_date1 = document_create_date1;
	}
	public String getDue_in_date() {
		return due_in_date;
	}
	public void setDue_in_date(String due_in_date) {
		this.due_in_date = due_in_date;
	}
	public String getInvoice_currency() {
		return invoice_currency;
	}
	public void setInvoice_currency(String invoice_currency) {
		this.invoice_currency = invoice_currency;
	}
	public String getDocument_type() {
		return document_type;
	}
	public void setDocument_type(String document_type) {
		this.document_type = document_type;
	}
	public Integer getPosting_id() {
		return posting_id;
	}
	public void setPosting_id(Integer posting_id) {
		this.posting_id = posting_id;
	}
	public String getArea_business() {
		return area_business;
	}
	public void setArea_business(String area_business) {
		this.area_business = area_business;
	}
	public Double getTotal_open_amount() {
		return total_open_amount;
	}
	public void setTotal_open_amount(Double total_open_amount) {
		this.total_open_amount = total_open_amount;
	}
	public String getBaseline_create_date() {
		return baseline_create_date;
	}
	public void setBaseline_create_date(String baseline_create_date) {
		this.baseline_create_date = baseline_create_date;
	}
	public String getCust_payement_terms() {
		return cust_payement_terms;
	}
	public void setCust_payement_terms(String cust_payement_terms) {
		this.cust_payement_terms = cust_payement_terms;
	}
	public Integer getInvoice_id() {
		return invoice_id;
	}
	public void setInvoice_id(Integer invoice_id) {
		this.invoice_id = invoice_id;
	}
	public Integer getIsOpen() {
		return isOpen;
	}
	public void setIsOpen(Integer isOpen) {
		this.isOpen = isOpen;
	}
	@Override
	public String toString() {
		return "Invoice [sl_no=" + sl_no + ", business_code=" + business_code + ", name_customer=" + name_customer
				+ ", cust_number=" + cust_number + ", clear_date=" + clear_date + ", buisness_year=" + buisness_year
				+ ", doc_id=" + doc_id + ", posting_date=" + posting_date + ", document_create_date="
				+ document_create_date + ", document_create_date1=" + document_create_date1 + ", due_in_date="
				+ due_in_date + ", invoice_currency=" + invoice_currency + ", document_type=" + document_type
				+ ", posting_id=" + posting_id + ", area_business=" + area_business + ", total_open_amount="
				+ total_open_amount + ", baseline_create_date=" + baseline_create_date + ", cust_payement_terms="
				+ cust_payement_terms + ", invoice_id=" + invoice_id + ", isOpen=" + isOpen;
	}
	private Integer sl_no;
	private String business_code;
	private Integer cust_number;
	private String name_customer;
	private String clear_date;
	private Float buisness_year; 
	private String doc_id;
	private String posting_date;
	private String document_create_date;
	private String document_create_date1;
	private String due_in_date;
	private String invoice_currency;
	private String document_type;
	private Integer posting_id;
	private String area_business;
	private Double total_open_amount;
	private String baseline_create_date;
	private String cust_payement_terms;
	private Integer invoice_id;
	private Integer isOpen;
}