package aerors.spider.Mapper;

import aerors.spider.Entity.Satellite;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
@Mapper
public interface GoodsMapper {
    void insertGood(HashMap map);
}
