/**
 * Project Name:DecoratorModelBeverage
 * File Name:Beverage.java
 * Package Name:
 * Date:2019-1-14下午2:36:13
 * Copyright (c) 2019, Changan Company All Rights Reserved.
 *
 */

/**
 * ClassName:Beverage <br/>
 * Function: 基类
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2019-1-14 下午2:36:13 <br/>
 * @author   吉祥
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class Beverage {
    protected String description;//饮料简介
    
    protected boolean milk=false;//是否有牛奶
    
    protected boolean soy=false;//是否有豆浆
    
    protected boolean cocha=false;//是否有摩卡
    
    protected boolean whip=false;//是否有奶泡
    
    protected double milkCost=1.01;//牛奶价格
    
    protected double soyCost=1.03;//豆浆价格
    
    protected double cochaCost=2.23;//摩卡价格
    
    protected double whipCost=0.89;//奶泡价格
    
    
    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public boolean hasMilk() {
        return milk;
    }


    public void setMilk(boolean milk) {
        this.milk = milk;
    }


    public boolean hasSoy() {
        return soy;
    }


    public void setSoy(boolean soy) {
        this.soy = soy;
    }


    public boolean hasCocha() {
        return cocha;
    }


    public void setCocha(boolean cocha) {
        this.cocha = cocha;
    }


    public boolean hasWhip() {
        return whip;
    }


    public void setWhip(boolean whip) {
        this.whip = whip;
    }
    
    


    public double getCochaCost() {
        return cochaCost;
    }


    public void setCochaCost(double cochaCost) {
        this.cochaCost = cochaCost;
    }


    public double getWhipCost() {
        return whipCost;
    }


    public void setWhipCost(double whipCost) {
        this.whipCost = whipCost;
    }


   

    public double cost(){
        
        double condiments=0.0;
        if(hasMilk()){//是否需要牛奶
            condiments+=milkCost;
        }
        if(hasSoy()){//是否需要豆浆
            condiments+=soyCost;
        }
        if(hasCocha()){//是否需要摩卡
            condiments+=cochaCost;
        }
        if(hasWhip()){//是否需要奶泡
            condiments+=whipCost;
        }
        return condiments;
    }

}
