package aerors.spider.Controller;

import aerors.spider.Entity.Satellite;
import aerors.spider.Service.SatelliteService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/satellite")
public class SateController {

    @Autowired
    SatelliteService satelliteService;

    @RequestMapping("/searchAll")
    public ModelAndView searchAll(){
        ModelAndView mv = new ModelAndView();
        List<Satellite> result = satelliteService.searchList();
        mv.addObject("result",result);
        mv.setViewName("listSatellite");
        return mv;
    }

    //根据列名动态排序
    @RequestMapping(value = "/searchAllOrderByField",method = {RequestMethod.POST,RequestMethod.GET})
    public ModelAndView searchAllOrderByField(@RequestParam(value = "columnName") String columnName){
        System.out.println(columnName);
        String matchStr = "select|update|delete|count|truncate|insert|drop|table|;";
        String []matches = matchStr.split("|");
        String lowerColumnName = columnName.toLowerCase();//全部转换为小写
        for (int i=0; i<matches.length; i++){
            if(columnName.contains(matches[i])){
                searchAll();
            }
        }
        ModelAndView mv = new ModelAndView();
        List<Satellite> result = satelliteService.searchListOrderByField(columnName);
        mv.addObject("result",result);
        mv.setViewName("listSatellite");
        return mv;
    }

    @RequestMapping("/searchList")
    @ResponseBody
    public List<Satellite> searchList(@RequestParam("pageNum") Integer pageNum,
                                          @RequestParam("pageSize") Integer pageSize){
        PageHelper.startPage(pageNum,pageSize);
        List<Satellite> personList = satelliteService.searchList();
        //得到分页的结果对象
        PageInfo<Satellite> personPageInfo = new PageInfo<>(personList);
        //得到分页中的person条目对象
        List<Satellite> pageList = personPageInfo.getList();
        return pageList;
    }

    @RequestMapping("/searchById")
    @ResponseBody
    public List<Satellite> searchById(@RequestParam("pageNum") Integer pageNum,
                                      @RequestParam("pageSize") Integer pageSize,
                                      @RequestParam("sateName") String sateName){
        List<Satellite> sates = satelliteService.searchBySateName(sateName);
        return  sates;
    }
}
