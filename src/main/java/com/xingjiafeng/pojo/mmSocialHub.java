package com.xingjiafeng.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 	打卡圈子
 * @author liang
 *
 */
@Data
@Accessors(chain = true)
@TableName(value = "mm_social_hub")
public class mmSocialHub {
    private Integer idIndex;//自增长ID
    private String idSocialHub;// 圈子ID
    private String title;//标题
    private String backgroundImage;//背景图片（图片链接地址）
    private String idOwner;// 圈子所有者
    private String introducePic;//介绍图片（图片链接地址）
    private String introduceContent;// 介绍内容
    private String idTag;// 标签
    private Long deposit;//保证金
    private String createBy;//创建人
    private Date createTime;// 创建时间
    private String updateBy;// 更新人
    private Date updateTime;// 更新时间
    
}