package com.tao.taoaicodeplatform.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.tao.taoaicodeplatform.model.entity.App;
import com.tao.taoaicodeplatform.mapper.AppMapper;
import com.tao.taoaicodeplatform.service.AppService;
import org.springframework.stereotype.Service;

/**
 * 应用 服务层实现。
 *
 * @author <a href="https://github.com/T-X-1013">奥德奈瑞</a>
 */
@Service
public class AppServiceImpl extends ServiceImpl<AppMapper, App>  implements AppService{

}
