package org.navis.ora.mapper;

import java.math.BigDecimal;
import org.navis.ora.bean.TestInfoBean;
import org.springframework.stereotype.Repository;

/**
 * 测试持久层
 * @author Administrator
 */
@Repository(value = "testInfoBeanMapper")
public interface TestInfoBeanMapper {

    int deleteByPrimaryKey(BigDecimal serialkey);

    int insert(TestInfoBean record);

    int insertSelective(TestInfoBean record);

    TestInfoBean selectByPrimaryKey(BigDecimal serialkey);

    int updateByPrimaryKeySelective(TestInfoBean record);

    int updateByPrimaryKey(TestInfoBean record);
}