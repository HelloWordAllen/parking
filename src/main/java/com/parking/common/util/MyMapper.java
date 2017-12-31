package com.parking.common.util;


import tk.mybatis.mapper.common.MySqlMapper;
import tk.mybatis.mapper.common.Mapper;
/**
 * 继承自己的MyMapper
 *
 * @author liuzh
 * @since 2015-09-06 21:53
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
    //TODO
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}
