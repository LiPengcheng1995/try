package com.gateway.project.repository.vender;

import com.gateway.project.domain.vender.Vender;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: lipengcheng3
 * @create: 2018-09-06 17:44
 * @description:
 **/
public interface VenderRepository extends JpaRepository<Vender, Integer> {
}
