package com.ricardo.nova.model;

import java.io.Serializable;

/**
 * lp_user_right
 * @author 
 */
public class LpUserRight implements Serializable {
    /**
     * 用户权限id
     */
    private Integer userRightId;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 权限id
     */
    private Integer rightId;

    /**
     * 权限类型
     */
    private Integer rightType;

    private static final long serialVersionUID = 1L;

    public Integer getUserRightId() {
        return userRightId;
    }

    public void setUserRightId(Integer userRightId) {
        this.userRightId = userRightId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
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
        LpUserRight other = (LpUserRight) that;
        return (this.getUserRightId() == null ? other.getUserRightId() == null : this.getUserRightId().equals(other.getUserRightId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getRightId() == null ? other.getRightId() == null : this.getRightId().equals(other.getRightId()))
            && (this.getRightType() == null ? other.getRightType() == null : this.getRightType().equals(other.getRightType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserRightId() == null) ? 0 : getUserRightId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
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
        sb.append(", userRightId=").append(userRightId);
        sb.append(", userId=").append(userId);
        sb.append(", rightId=").append(rightId);
        sb.append(", rightType=").append(rightType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}