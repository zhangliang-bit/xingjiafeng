package mapper;

import com.xingjiafeng.pojo.MmSocialHubMember;

public interface MmSocialHubMemberMapper {
    int deleteByPrimaryKey(Integer idJoin);

    int insert(MmSocialHubMember record);

    int insertSelective(MmSocialHubMember record);

    MmSocialHubMember selectByPrimaryKey(Integer idJoin);

    int updateByPrimaryKeySelective(MmSocialHubMember record);

    int updateByPrimaryKey(MmSocialHubMember record);
}