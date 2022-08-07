package net.lzip.ant.serviceImpl;

import net.lzip.ant.model.Ec;
import net.lzip.ant.mapper.EcMapper;
import net.lzip.ant.service.IEcService;
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
public class EcServiceImpl extends ServiceImpl<EcMapper, Ec> implements IEcService {

}
