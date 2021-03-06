package com.f2boy.domain.entity;

import com.f2boy.domain.jsondo.ApiParams;
import java.io.Serializable;
import java.util.Date;

public class Api implements Serializable {
    /**  */
    private Integer id;

    /** 模块id */
    private Integer moduleId;

    /** 名称 */
    private String name;

    /** uri */
    private String uri;

    /** 请求方法：get or post */
    private String method;

    /** 功能 */
    private String function;

    /** 请求的content-type，分为form和json */
    private String contentType;

    /** 请求参数。这里存储的是json，应用程序负责转化 */
    private ApiParams params;

    /** 请求参数直接为json格式 */
    private String jsonParams;

    /** 响应数据 */
    private String response;

    /** 备注 */
    private String memo;

    /** 排序号 */
    private Integer sortNo;

    /** 创建时间 */
    private Date createTime;

    /** 修改时间 */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method == null ? null : method.trim();
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function == null ? null : function.trim();
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType == null ? null : contentType.trim();
    }

    public ApiParams getParams() {
        return params;
    }

    public void setParams(ApiParams params) {
        this.params = params;
    }

    public String getJsonParams() {
        return jsonParams;
    }

    public void setJsonParams(String jsonParams) {
        this.jsonParams = jsonParams == null ? null : jsonParams.trim();
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response == null ? null : response.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}