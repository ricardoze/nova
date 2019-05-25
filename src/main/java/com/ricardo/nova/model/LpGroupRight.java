package com.ricardo.nova.model;

import java.io.Serializable;

/**
 * lp_group_right
 * @author 
 */
public class LpGroupRight implements Serializable {
    /**
     * 组权限id
     */
    private Integer groupRightId;

    /**
     * 组id
     */
    private Integer groupId;

    /**
     * 权限id
     */
    private Integer rightId;

    /**
     * 权限类型
     */
    private Integer rightType;

    private static final long serialVersionUID = 1L;

    public Integer getGroupRightId() {
        return groupRightId;
    }

    public void setGroupRightId(Integer groupRightId) {
        this.groupRightId = groupRightId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }

    public Integer getRightType() {
        return rightType;
    }

    public void setRightType(Integer rightType) {
        this.rightType = rightType;
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
        LpGroupRight other = (LpGroupRight) that;
        return (this.getGroupRightId() == null ? other.getGroupRightId() == null : this.getGroupRightId().equals(other.getGroupRightId()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getRightId() == null ? other.getRightId() == null : this.getRightId().equals(other.getRightId()))
            && (this.getRightType() == null ? other.getRightType() == null : this.getRightType().equals(other.getRightType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGroupRightId() == null) ? 0 : getGroupRightId().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getRightId() == null) ? 0 : getRightId().hashCode());
        result = prime * result + ((getRightType() == null) ? 0 : getRightType().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", groupRightId=").append(groupRightId);
        sb.append(", groupId=").append(groupId);
        sb.append(", rightId=").append(rightId);
        sb.append(", rightType=").append(rightType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}