package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author songtao
 * @create 2020-01-2020/1/5-20:36
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
