package com.restructure.demo.factoryMethod;

import com.restructure.demo.simpleFactory.HisenseTV;
import com.restructure.demo.simpleFactory.TV;

/**
 * @author mac
 */
public class HisenseTVFactory implements TVFactory
{
    @Override
    public TV produceTV()
    {
        System.out.println("海信电视机工厂生产海信电视机。");
    	return new HisenseTV();
    }
}