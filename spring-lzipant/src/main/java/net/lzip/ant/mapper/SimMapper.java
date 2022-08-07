package net.lzip.ant.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.lzip.ant.model.Sim;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Harrison Lee
 * @since 2022-06-26 19:10:51
 */
@Mapper
public interface SimMapper extends BaseMapper<Sim> {

	List<Sim> listByEcId(int ecId);

}
