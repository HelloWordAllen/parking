package com.parking.common;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * @author andy.ding
 */
public class DataTableRequest implements Pageable, Serializable {

    private int pageSize;
    private int offset;
    private int pageNumber;
    private int draw;

    private List<DataTableColumn> columns;

    private Sort sort;

    private List<DataTableConditions> conditions;

    public final static int maxPageSize = 10000;

    public DataTableRequest() {

    }

    /**
     * Creates a new {@link PageRequest} with sort parameters applied.
     *
     * @param page zero-based page index.
     * @param size the size of the page to be returned.
     * @param sort can be {@literal null}.
     */
    public DataTableRequest(int page, int size, Sort sort, int draw) {
        this.pageNumber = page;
        this.pageSize = size;
        this.sort = sort;
        this.draw = draw;
    }

    public DataTableRequest(int page, int offset, int size, Sort sort, int draw) {
        this.pageNumber = page;
        this.pageSize = size;
        this.sort = sort;
        this.offset = offset;
        this.draw = draw;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getPageNumber() {
        // TODO Auto-generated method stub
        return this.pageNumber;
    }


    public int getPageSize() {
        // TODO Auto-generated method stub
        return this.pageSize;
    }


    public int getOffset() {
        // TODO Auto-generated method stub
        return this.offset;
    }


    public Sort getSort() {
        // TODO Auto-generated method stub
        if (null == this.sort) {
            if (null != this.columns && this.columns.size() > 0) {
                List<Order> orderList = new ArrayList<Order>();
                for (DataTableColumn column : columns) {
                    if (column.getOrderType() != null && column.getOrderType().length() > 0) {
                        if (DataTableColumn.ORDER_TYPE_ASC.equals(column.getOrderType()
                                .toLowerCase())) {
                            orderList.add(new Order(Direction.ASC, column.getName()));
                        } else {
                            orderList.add(new Order(Direction.DESC, column.getName()));
                        }
                    }
                }
                if (orderList.size() > 0) {
                    this.sort = new Sort(orderList);
                }
            }
        }
        return this.sort;
    }


    public Pageable next() {
        // TODO Auto-generated method stub
        return new DataTableRequest(getPageNumber() + 1, getPageSize(), getSort(), getDraw());
    }


    public Pageable previousOrFirst() {
        // TODO Auto-generated method stub
        return getPageNumber() == 0 ? this : new DataTableRequest(getPageNumber() - 1,
                getPageSize(), getSort(), getDraw());
    }


    public Pageable first() {
        // TODO Auto-generated method stub
        return new DataTableRequest(0, getPageSize(), getSort(), getDraw());
    }


    public boolean hasPrevious() {
        // TODO Auto-generated method stub
        return false;
    }

    public List<DataTableColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<DataTableColumn> columns) {
        this.columns = columns;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("Page request [number: %d, size %d, sort: %s]", getPageNumber(),
                getPageSize(), sort == null ? null : sort.toString());
    }

    public DataTableResponse toResponse() {
        return null;
    }

    public List<DataTableConditions> getConditions() {
        return conditions;
    }

    public void setConditions(List<DataTableConditions> conditions) {
        this.conditions = conditions;
    }

}

