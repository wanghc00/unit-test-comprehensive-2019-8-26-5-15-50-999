/*
 * Copyright (C), 1992-2019
 * Package tw.controller 
 * FileName: CheckInputFormat.java
 * Author:   wang-hc
 * Date:     2019年8月26日 下午10:15:58
 * Description: //模块目的、功能描述      
 * History: //修改记录
 *===============================================================================================
 *   author：          time：                             version：           desc：
 *   wang-hc           2019年8月26日下午10:15:58                     1.0                  
 *===============================================================================================
 */
package tw.controller;

/**
 * 名称：〈一句话功能简述〉<br> 
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 日期：2019年8月26日 <br>
 * 作者：wang-hc <br>
 * 说明：<br>
 */
public class CheckInputFormat {
    /**
     * 
     */
    public static String checkInput(String input) {
        if(!input.replace(" ", "").matches("[0-9]+")){
            return "输入错误，再次输入";
        }
        String[] inputs = input.trim().split(" ");
        if (inputs.length != 4) {
            return "输入错误，再次输入";
        }
        for (int i = 0; i < inputs.length-1; i++) {
            for (int j = i+1; j < inputs.length; j++) {
                if (inputs[i] == inputs[j]) {
                    return "输入错误，再次输入";
                }
            }
        }
        for (int i = 0; i < inputs.length; i++) {
            if (Integer.parseInt(inputs[0]) < 0 || Integer.parseInt(inputs[0])>9) {
                return "输入错误，再次输入";
            }
        }    
        return "input normal";

    }

}
