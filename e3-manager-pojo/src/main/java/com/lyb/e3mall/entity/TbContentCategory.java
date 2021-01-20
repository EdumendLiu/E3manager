package com.lyb.e3mall.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * (TbContentCategory)实体类
 *
 * @author makejava
 * @since 2020-12-07 18:34:37
 */
public class TbContentCategory implements Serializable {
    private static final long serialVersionUID = -66406588236737286L;

    private Integer id;

    private Integer parentId;

    private String name;

    private Integer status;

    private String sortOrder;

    private Boolean isParent;

    private Date created;

    private Date updated;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

}
