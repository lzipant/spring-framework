package net.lzip.ant.serviceImpl;

import net.lzip.ant.model.SimStatus;
import net.lzip.ant.mapper.SimStatusMapper;
import net.lzip.ant.service.ISimStatusService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Harrison Lee
 * @since 2022-06-26 19:10:51
 */
@Service
public class SimStatusServiceImpl extends ServiceImpl<SimStatusMapper, SimStatus> implements ISimStatusService {

}
