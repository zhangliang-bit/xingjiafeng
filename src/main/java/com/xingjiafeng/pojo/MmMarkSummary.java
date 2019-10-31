package com.xingjiafeng.pojo;

import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Data;
import lombok.experimental.Accessors;
/**
 * 	打卡记录
 * @author liang
 *
 */
@Data
@Accessors(chain = true)
@TableName(value = "mm_mark_summary")
public class MmMarkSummary {
    private Integer idSubject;// 打卡ID
    private Integer subjectMarkCount;//打卡次数
    private Integer subjectMarkNumber;//打卡人数

   
}