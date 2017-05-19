package com.common.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;


/**
 * <p>
 *    用户表
 * </p>
 *
 * @author wangfj
 * @since 2017-05-19
 */
@TableName("my_user")
public class MyUser extends Model<MyUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 主键uuid
     */
	@TableId(type = IdType.UUID)
	private String uuid;
    /**
     * 登录账号
     */
	private String login_name;
    /**
     * 密码
     */
	private String password;
    /**
     * 角色类型
     */
	private Integer role_type;
    /**
     * 角色姓名
     */
	private String role_name;
    /**
     * 电话
     */
	private String mobile;
    /**
     * 邮箱
     */
	private String email;
    /**
     * 性别
     */
	private String sex;
    /**
     * 用户头像
     */
	private String head_img;
    /**
     * 注册时间
     */
	private Date register_time;
    /**
     * 最后一次登录时间
     */
	private Date login_time;


	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getRole_type() {
		return role_type;
	}

	public void setRole_type(Integer role_type) {
		this.role_type = role_type;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getHead_img() {
		return head_img;
	}

	public void setHead_img(String head_img) {
		this.head_img = head_img;
	}

	public Date getRegister_time() {
		return register_time;
	}

	public void setRegister_time(Date register_time) {
		this.register_time = register_time;
	}

	public Date getLogin_time() {
		return login_time;
	}

	public void setLogin_time(Date login_time) {
		this.login_time = login_time;
	}

	@Override
	protected Serializable pkVal() {
		return this.uuid;
	}

}
