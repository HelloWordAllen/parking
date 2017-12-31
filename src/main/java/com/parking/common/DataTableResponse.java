package com.parking.common;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

@XmlRootElement
public class DataTableResponse implements Serializable {

    public DataTableResponse() {
    }

    private Object data = null;


    private int total;


    private int filtered;


    private int pageNumber;

    @XmlTransient
    private Map<String, Object> resultMap = new LinkedHashMap();

    public DataTableResponse(Object data, int total, int pageNumber, int draw) {
        setData(data);
        setTotal(total);
        setPageNumber(pageNumber);
        this.draw = draw;
    }


    public DataTableResponse(Object data, int pageNumber, int draw) {
        setData(data);
        setPageNumber(pageNumber);
        this.draw = draw;
    }


    public DataTableResponse(int total, Object data) {
        setData(data);
        setTotal(total);
    }

    public DataTableResponse(Object data) {
        setData(data);

    }

    private int draw;

    private int recordsFiltered;

    private int recordsTotal;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.recordsFiltered = total;
        this.filtered = total;
        this.recordsTotal = total;
        this.total = total;
    }

    public int getFiltered() {
        return filtered;
    }

    public void setFiltered(int filtered) {
        this.recordsFiltered = filtered;
        this.filtered = filtered;
        this.recordsTotal = filtered;
        this.total = filtered;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(int recordsFiltered) {
        this.filtered = recordsFiltered;
        this.recordsFiltered = recordsFiltered;
    }

    public int getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(int recordsTotal) {
        this.total = recordsTotal;
        this.recordsTotal = recordsTotal;
    }

    public Set<Map.Entry<String, Object>> entrySet() {
        return this.resultMap.entrySet();
    }

    public Object put(String key, Object value) {
        return this.resultMap.put(key, value);
    }


}

