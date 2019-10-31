package mapper;

import com.xingjiafeng.pojo.MmMarkSubject;

public interface MmMarkSubjectMapper {
    int deleteByPrimaryKey(Integer idIndex);

    int insert(MmMarkSubject record);

    int insertSelective(MmMarkSubject record);

    MmMarkSubject selectByPrimaryKey(Integer idIndex);

    int updateByPrimaryKeySelective(MmMarkSubject record);

    int updateByPrimaryKey(MmMarkSubject record);
}