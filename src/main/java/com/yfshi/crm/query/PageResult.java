package com.yfshi.crm.query;


import java.util.ArrayList;
import java.util.List;

public class PageResult {

    //--------------------------实例属性---------------------------
    private  Long total;    //总记录
    //使用List不指明泛型是为保证List能够接收不同的泛型，若指明就无法支持了
    //如定义List<object> 那么 result就无法赋值List<Employee>的具体列表了
    private List result;  //该页结果，

    //--------------------------类属性---------------------------
    public static final PageResult EMPTY = new PageResult(0L,new ArrayList());  ;   //空对象

    //-------------------------方法-----------------------
    public PageResult(){
    }

    /**
     *
     * @param totalValue
     * @param rows 使用List不指明泛型是为保证List能够接收不同的泛型，若指明就无法支持了
     */
    public PageResult(Long totalValue, List rows){
        total = totalValue;
        result = rows;
    }


}
