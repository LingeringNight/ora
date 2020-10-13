package org.navis.ora.service.impl;

import org.navis.ora.bean.TestInfoBean;
import org.navis.ora.mapper.TestInfoBeanMapper;
import org.navis.ora.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * 测试类服务层实现类
 * @author Administrator
 */
@Service
public class TestServiceImpl implements TestService {

    @Resource(name = "testInfoBeanMapper")
    private TestInfoBeanMapper testInfoBeanMapper;

    public TestServiceImpl(TestInfoBeanMapper testInfoBeanMapper) {
        this.testInfoBeanMapper = testInfoBeanMapper;
    }


    @Override
    public String showTestMessage() {
        TestInfoBean testInfoBean = testInfoBeanMapper.selectByPrimaryKey(
                BigDecimal.valueOf(1));
        if(testInfoBean != null){
            return testInfoBean.getTestvalue();
        }
        else{
            return "null";
        }
    }
}
