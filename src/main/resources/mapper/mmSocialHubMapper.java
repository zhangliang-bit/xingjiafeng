package mapper;

import com.xingjiafeng.pojo.mmSocialHub;

public interface mmSocialHubMapper {
    int deleteByPrimaryKey(Integer idIndex);

    int insert(mmSocialHub record);

    int insertSelective(mmSocialHub record);

    mmSocialHub selectByPrimaryKey(Integer idIndex);

    int updateByPrimaryKeySelective(mmSocialHub record);

    int updateByPrimaryKey(mmSocialHub record);
}