package com.parking.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.parking.common.Result;
import com.parking.common.util.ResultUtil;
import com.parking.dao.bean.Test;
import com.parking.dao.mapper.TestMapper;
import com.parking.service.api.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import java.util.List;

/**
 * Created by wpg on 2017/12/31.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    public Result getAllTest() {
        PageHelper.startPage(1,2);
        Example example = new Example(Test.class);
        example.createCriteria().andEqualTo("name","wpg");
        List<Test> tests = testMapper.selectByExample(example);
        PageInfo<Test> pageInfo = new PageInfo<Test>(tests);
        return ResultUtil.success(pageInfo);
    }
}
