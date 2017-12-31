package com.parking.common;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

//@XmlRootElement(name = "result")
public class Result implements Serializable {
	public static final int CODE_200 = 200;
	public static final int CODE_500 = 500;
	public static final int CODE_400 = 400;
	public static final String STATUS_SUCCESS = "success";
	public static final String STATUS_FAIL = "fail";
	public static final String STATUS_ERROR = "error";

	//@XmlTransient
	private static final long serialVersionUID = 7314426258735242407L;
	private int code;
	private String status;
	private String message;
	private Object data = null;

	//@XmlTransient
	private Map<String, Object> resultMap = new LinkedHashMap();

	public Result() {
		this.code = 200;
	}

	public Result(String message) {
		this.message = message;
	}

	public Result(Object data) {
		this();
		this.data = data;
	}

	public Result(int code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;
	}

	public Result(String status, String message) {
		this.status = status;
		this.message = message;
	}

	public Result toSuccess() {
		this.code = 200;
		this.status = "success";
		return this;
	}

	public Result toFail() {
		this.code = 400;
		this.status = "fail";
		return this;
	}

	public Result toError() {
		this.code = 500;
		this.status = "error";
		return this;
	}

	public Result toMessage() {
		this.code = 200;
		this.status = "message";
		return this;
	}

	public boolean isSuccess(){
		if(this.code == CODE_200) {
			return true;
		}
		return false;
	}
	
	public static Result data(Object data) {
		return new Result(data);
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getStatus() {
		if (this.status == null) {
			if ((this.code >= 500) && (this.code <= 599)) {
                this.status = "fail";
            } else if ((this.code >= 400) && (this.code <= 499)) {
                this.status = "error";
            } else {
				this.status = "success";
			}
		}
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		if (this.data == null) {
			return this.resultMap;
		}
		return this.data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public int size() {
		return this.resultMap.size();
	}

	public boolean containsKey(Object key) {
		return this.resultMap.containsKey(key);
	}

	public boolean containsValue(Object value) {
		return this.resultMap.containsValue(value);
	}

	public Object get(Object key) {
		return this.resultMap.get(key);
	}

	public Object remove(Object key) {
		return this.resultMap.remove(key);
	}

	public void putAll(Map<? extends String, ? extends Object> m) {
		this.resultMap.putAll(m);
	}

	public void clear() {
		this.resultMap.clear();
	}

	public Set<String> keySet() {
		return this.resultMap.keySet();
	}

	public Collection<Object> values() {
		return this.resultMap.values();
	}

	public Set<Map.Entry<String, Object>> entrySet() {
		return this.resultMap.entrySet();
	}

	public Object put(String key, Object value) {
		return this.resultMap.put(key, value);
	}
}
