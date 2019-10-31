package mapper;

import com.xingjiafeng.pojo.MmUser;

public interface MmUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MmUser record);

    int insertSelective(MmUser record);

    MmUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MmUser record);

    int updateByPrimaryKey(MmUser record);
}