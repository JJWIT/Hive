package com.jjw;/**
 * Created by jiajianwei1 on 2019/4/11.
 */

import org.apache.hadoop.hive.ql.exec.UDF;

/**
 * @ClassName ItcastFunc
 * @Description TODO
 * @Author jiajianwei1
 * @Date 2019/4/11 10:58
 * @Version 1.0
 **/
public class ItcastFunc extends UDF{
    //重载
    public String evaluate(String input){
        return input.toLowerCase();//将大写字母转换成小写
    }

    public int evaluate(int a,int b){
        return a+b;//计算两个数之和
    }
}
