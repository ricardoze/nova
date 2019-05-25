package com.ricardo.nova.model;

import java.io.Serializable;

/**
 * lp_role_right
 * @author 
 */
public class LpRoleRight implements Serializable {
    /**
     * 角色权限id
     */
    private Integer roleRightId;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 权限id
     */
    private Integer rightId;

    /**
     * 权限类型
     */
    private Integer rightType;

    private static final long serialVersionUID = 1L;

    public Integer getRoleRightId() {
        return roleRightId;
    }

    public void setRoleRightId(Integer roleRightId) {
        this.roleRightId = roleRightId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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
        LpRoleRight other = (LpRoleRight) that;
        return (this.getRoleRightId() == null ? other.getRoleRightId() == null : this.getRoleRightId().equals(other.getRoleRightId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getRightId() == null ? other.getRightId() == null : this.getRightId().equals(other.getRightId()))
            && (this.getRightType() == null ? other.getRightType() == null : this.getRightType().equals(other.getRightType()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleRightId() == null) ? 0 : getRoleRightId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
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
        sb.append(", roleRightId=").append(roleRightId);
        sb.append(", roleId=").append(roleId);
        sb.append(", rightId=").append(rightId);
        sb.append(", rightType=").append(rightType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}