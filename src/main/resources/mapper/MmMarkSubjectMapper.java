package mapper;

import com.xingjiafeng.pojo.MmMarkSubject;

public interface MmMarkSubjectMapper {
    int deleteByPrimaryKey(Integer idIndex);

    int insert(MmMarkSubject recojrd);

    int insertSelective(MmMarkSubject record);

    MmMarkSubject selectByPrimaryKey(Integer idIndex);

    int updateByPrimaryKeySelective(MmMarkSubject record);

    int updateByPrimaryKey(MmMarkSubject record);
}