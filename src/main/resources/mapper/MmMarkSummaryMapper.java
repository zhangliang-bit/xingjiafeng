package mapper;

import com.xingjiafeng.pojo.MmMarkSummary;

public interface MmMarkSummaryMapper {
    int insert(MmMarkSummary record);

    int insertSelective(MmMarkSummary record);
}