package com.admin.persistence;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
/**
 * Created by binesh on 4/23/2017.
 */
@Entity
@Table(name="ROLE")
public class Role {


    @Id
    @GeneratedValue
    @Column(name = "USER_ID",unique = true,nullable = false)
	private int roleId;

    @Column(name = "CODE")
	private String code;

   @Column(name = "LABEL")
	private String label;

   	@OneToOne
	@PrimaryKeyJoinColumn
	private User user;

    public Role(){}


	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
