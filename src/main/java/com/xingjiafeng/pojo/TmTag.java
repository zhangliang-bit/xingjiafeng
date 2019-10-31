package com.xingjiafeng.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *	 标签表
 * @author liang
 *
 */
@Data
@Accessors(chain = true)
@TableName(value = "tm_tag")
public class TmTag {
    private Integer idTag;//标签ID
    private String tag;//标签
    private Integer recommend;// 是否常用标签（0：不推荐 1：推荐）
    private String createBy;// 标签创建人 默认（system）
    private Date createTime;//标签创建时间
   
}