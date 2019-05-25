package com.ricardo.nova.model;

import java.io.Serializable;
import java.util.Date;

/**
 * lp_group
 * @author 
 */
public class LpGroup implements Serializable {
    /**
     * 组id
     */
    private Integer groupId;

    /**
     * 组名
     */
    private String groupName;

    /**
     * 父组id
     */
    private Integer parentGroupId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 组描述
     */
    private String groupDescription;

    private static final long serialVersionUID = 1L;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getParentGroupId() {
        return parentGroupId;
    }

    public void setParentGroupId(Integer parentGroupId) {
        this.parentGroupId = parentGroupId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        LpGroup other = (LpGroup) that;
        return (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getGroupName() == null ? other.getGroupName() == null : this.getGroupName().equals(other.getGroupName()))
            && (this.getParentGroupId() == null ? other.getParentGroupId() == null : this.getParentGroupId().equals(other.getParentGroupId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getGroupDescription() == null ? other.getGroupDescription() == null : this.getGroupDescription().equals(other.getGroupDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        result = prime * result + ((getParentGroupId() == null) ? 0 : getParentGroupId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getGroupDescription() == null) ? 0 : getGroupDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", groupId=").append(groupId);
        sb.append(", groupName=").append(groupName);
        sb.append(", parentGroupId=").append(parentGroupId);
        sb.append(", createTime=").append(createTime);
        sb.append(", groupDescription=").append(groupDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}