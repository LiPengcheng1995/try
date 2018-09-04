package com.gateway.project.mapper.vender;

import com.gateway.project.domain.Vender;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: lipengcheng3
 * @create: 2018-09-04 17:33
 * @description:
 **/
@Mapper
public interface VenderMapper {

    @Select("select * from vender where sku = #{sku}")
    Vender getVenderBySku(int sku);

    @Select("select * from vender")
    List<Vender> getAllVenders();

    @Select("select * from vender where price between #{minPrice} and #{maxPrice}")
    List<Vender> getUsersByPriceRangeClosed(int minPrice, int maxPrice);
}
