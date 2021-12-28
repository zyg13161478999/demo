package com.restructure.demo;

/**
 * @author .gang
 * 移除设值函数
 * 类中的某个字段应该在对象创建时被设值，然后就不再改变。去掉该字段的所有设值函数
 * @date 2021/12/28
 */
public class RemoveSettingMethod {
    private String _id;
    RemoveSettingMethod(String id){
        setId(id);
    }
    void setId(String arg) {
        _id = arg.substring(0,1);
    }

    public String get_id() {
        return _id;
    }
}
