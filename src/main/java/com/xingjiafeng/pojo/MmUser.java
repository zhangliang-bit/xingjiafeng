package com.xingjiafeng.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 	用户表
 * @author liang
 *
 */
@Data
@Accessors(chain = true)
@TableName(value = "mm_user")
public class MmUser {
	private Integer id;//	自增长id
	private Integer identityId;//身份(1.圈主 2.成员)
	private Integer codeId;//判断用户唯一的id
	private String username;//用户名
	private String vactor;// 头像
	private String sex;//性别
	private String address;//地址
	private String phone;//手机号码

}
