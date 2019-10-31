package com.xingjiafeng.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;
/**
 *  	主题
 * @author liang
 *
 */
@Data
@Accessors(chain = true)
@TableName(value = "mm_mark_subject")
public class MmMarkSubject {
	private Integer idIndex;// 自增长ID
	private Integer idSubject;// 主题ID
	private Integer idSocialHub;// 圈子ID
	private String subjectTitle;// 主题标题
	private String subjectMainPic;// 主题主图地址
	private String subjectContect;// 主题内容
	private String markStartTime;// 主题打卡开始时间（yyyyMMdd）
	private String markEndTime;// 主题打卡结束时间（yyyyMMdd）
	private String createBy;// 创建人
	private Date createTime;// 创建时间
	private String updateBy;// 更新人
	private Date updateTime;// 更新时间
}