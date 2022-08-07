package net.lzip.ant.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import net.lzip.ant.mapper.SimMapper;
import net.lzip.ant.model.Sim;
import net.lzip.ant.service.ISimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Harrison Lee
 * @since 2022-06-26 19:10:51
 */
@Service
public class SimServiceImpl extends ServiceImpl<SimMapper, Sim> implements ISimService {

	@Autowired
	private SimMapper simMapper;

	@Override
	public List<Sim> listByEcId(int ecId) {
		if (ecId <= 0) {
			return null;
		}
		return simMapper.listByEcId(ecId);
	}

}
