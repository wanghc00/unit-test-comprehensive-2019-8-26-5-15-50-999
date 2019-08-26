/*
 * Copyright (C), 1992-2019
 * Package tw.controller 
 * FileName: CountResult.java
 * Author:   wang-hc
 * Date:     2019年8月26日 下午10:48:48
 * Description: //模块目的、功能描述      
 * History: //修改记录
 *===============================================================================================
 *   author：          time：                             version：           desc：
 *   wang-hc           2019年8月26日下午10:48:48                     1.0                  
 *===============================================================================================
 */
package tw.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * 名称：〈一句话功能简述〉<br> 
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 日期：2019年8月26日 <br>
 * 作者：wang-hc <br>
 * 说明：<br>
 */
public class CountGuessResult {
    public static String CountResult(String[] inputs, List<Integer> gameAnswer) {
        int a = 0;
        int b = 0;
        String as = "";
        String bs = "";
        String result = "";
        for (int i = 0; i < inputs.length; i++) {
            if (gameAnswer.get(i) == Integer.valueOf(inputs[i])) {
                a++;
                as = as + inputs[i] + "和";
            }else if (gameAnswer.contains(Integer.valueOf(inputs[i]))) {
                b++;
                bs = bs + inputs[i] + "和";
            }//s = s.Substring(0,s.Length - 1)
        }
        if (a == 4) {
            result = "胜利，一切正确";
            
        }else if (b == 4) {
            result = "4个数字位置错误";
        }else if(a == 0 && b == 0) {
            result = "都错了";
        }else if(a == 0 && b != 0){
            result = bs.substring(0,bs.length() - 1) + "错误的位置";
        }else if (b == 0 && a != 0) {
            result = as.substring(0,as.length() - 1) + "正确";
        }else{
            result = as.substring(0,as.length() - 1) + "正确" + "，" + bs.substring(0,bs.length() - 1) + "错误的位置";
        }
        return a+"A"+b+"B"+" "+result;
        
    }
}
