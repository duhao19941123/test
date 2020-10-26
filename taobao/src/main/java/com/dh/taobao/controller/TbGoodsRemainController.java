package  com.dh.taobao.controller;

import com.dh.taobao.service.TbGoodsRemainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 商品库存表(TbGoodsRemain)表控制层
 *
 * @author makejava
 * @since 2020-10-26 22:58:37
 */
@RestController
@RequestMapping("tbGoodsRemain")
public class TbGoodsRemainController {

    @Autowired
    private TbGoodsRemainService tbGoodsRemainService;

    @GetMapping("test")
    public String test(String id){
       return tbGoodsRemainService.getById(id).getGoodsSize();
    }
}