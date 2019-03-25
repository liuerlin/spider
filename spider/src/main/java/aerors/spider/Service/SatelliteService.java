package aerors.spider.Service;

import aerors.spider.Entity.Satellite;

import java.util.List;

public interface SatelliteService {
    List<Satellite> searchList();
    List<Satellite> searchListOrderByField(String columnName);
    List<Satellite> searchBySateName(String sateName);
 }
