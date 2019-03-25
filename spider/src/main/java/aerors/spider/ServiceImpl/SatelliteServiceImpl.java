package aerors.spider.ServiceImpl;

import aerors.spider.Entity.Satellite;
import aerors.spider.Mapper.SateMapper;
import aerors.spider.Service.SatelliteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class SatelliteServiceImpl implements SatelliteService {
    @Autowired
    SateMapper sateMapper;
    @Override
    public List<Satellite> searchList() {
        List<Satellite> sateList = sateMapper.searchList();
        return sateList;
    }

    @Override
    public List<Satellite> searchListOrderByField(String columnName) {
        HashMap map = new HashMap();
        map.put("columnName",columnName);
        return sateMapper.searchListOrderByField(map);
    }

    @Override
    public List<Satellite> searchBySateName(String sateName) {
        HashMap map = new HashMap();
        map.put("sateName",sateName);
        return sateMapper.searchBySateName(map);
    }
}
