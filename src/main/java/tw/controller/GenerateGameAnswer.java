/*
 * Copyright (C), 1992-2019
 * Package tw.controller 
 * FileName: GenerateGameAnswer.java
 * Author:   wang-hc
 * Date:     2019年8月26日 下午9:32:47
 * Description: //模块目的、功能描述      
 * History: //修改记录
 *===============================================================================================
 *   author：          time：                             version：           desc：
 *   wang-hc           2019年8月26日下午9:32:47                     1.0                  
 *===============================================================================================
 */
package tw.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 名称：〈一句话功能简述〉<br> 
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 日期：2019年8月26日 <br>
 * 作者：wang-hc <br>
 * 说明：<br>
 */
public class GenerateGameAnswer {
    
    public static List<Integer> GenerateFourNum() {
        List<Integer> result = new ArrayList<Integer>();
        int num = new Random().nextInt(10);
        result.add(num);
        for (int i = 0; i < 4; i++) {
            num = new Random().nextInt(10);
            if (!result.contains(num)) {
                result.add(num);
            }
            
        }
        return result;
    }

}
