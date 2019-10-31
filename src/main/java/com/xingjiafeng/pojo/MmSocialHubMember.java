package com.xingjiafeng.pojo;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *	圈子成员
 * @author liang
 *
 */
@Data
@Accessors(chain = true)
@TableName(value = "mm_social_hub_member")
public class MmSocialHubMember {
    private Integer idJoin;//加入ID
    private Integer idMember;//  圈子用户ID
    private Integer idSocialHub;//圈子ID
    private Date createTime;//加入圈子时间
   
}