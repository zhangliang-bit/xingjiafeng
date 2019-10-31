package mapper;

import com.xingjiafeng.pojo.MmMark;

public interface MmMarkMapper {
    int deleteByPrimaryKey(Integer idIndex);

    int insert(MmMark record);

    int insertSelective(MmMark record);

    MmMark selectByPrimaryKey(Integer idIndex);

    int updateByPrimaryKeySelective(MmMark record);

    int updateByPrimaryKey(MmMark record);
}