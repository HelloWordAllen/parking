package com.parking.common;

import java.io.Serializable;

public class DataTableColumn implements Serializable {

    public static final String ORDER_TYPE_ASC = "asc";

    public static final String ORDER_TYPE_DESC = "desc";

    public static final String SEARCH_TYPE_INT = "int";

    public static final String SEARCH_TYPE_STRING = "string";

    public static final String SEARCH_TYPE_DATE = "date";

    public static final String SEARCH_TYPE_BOOLEAN = "boolean";


    private String name;

    private String searchText;

    private String searchType;

    private String orderType;


    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSearchText() {
        return searchText;
    }

    public void setSearchText(String searchText) {
        this.searchText = searchText;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}
