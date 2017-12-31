package com.parking.common;

import java.io.Serializable;
import java.util.List;

public class DataTableConditions implements Serializable {


    /**
     * 等于查询
     */
    public static final String SQL_OPT_EQUAL = "=";

    /**
     * in查询
     */
    public static final String SQL_OPT_IN = "in";

    /**
     * 大于
     */
    public static final String SQL_OPT_GT = ">";

    public static final String SQL_OPT_GE = ">=";

    /**
     * 小于
     */
    public static final String SQL_OPT_LT = "<";

    public static final String SQL_OPT_LE = "<=";

    public static final String SQL_OPT_LIKE = "like";

    /**
     * boolean型验证
     */
    public static final String SQL_OPT_IS = "is";

    public static final String SQL_OPT_NO_EQUAL = "!=";

    /**
     * 字段
     */
    private String field;

    /**
     * 比较类型
     */
    private String opt;

    /**
     * 多个值
     */
    private List<String> values;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getOpt() {
        return opt;
    }

    public void setOpt(String opt) {
        this.opt = opt;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }
}
