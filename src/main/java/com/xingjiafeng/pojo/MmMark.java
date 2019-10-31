package com.xingjiafeng.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *	 打卡
 * @author liang
 *
 */
@Data
@Accessors(chain = true)
@TableName(value = "mm_mark")
public class MmMark {
    private Integer idIndex;//自增长ID
    private Integer idMark;//打卡ID
    private Integer idSubject;//主题ID
    private Integer idSocialHub;//圈子ID
    private String markPic;//打卡图片
    private String markContect;//打卡内容
    private String markDate;//打卡日期（yyyyMMdd）
    private String createBy;//创建人 
    private Date createTime; //创建时间（yyyyMMdd）
}