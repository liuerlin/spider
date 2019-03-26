package aerors.spider.ServiceImpl;

import aerors.spider.Mapper.GoodsMapper;
import aerors.spider.Mapper.SateMapper;
import aerors.spider.Service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service("goodService")
public class GoodServiceImpl implements GoodService {
    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public void insertGood(HashMap param) {
        goodsMapper.insertGood(param);
    }
}
