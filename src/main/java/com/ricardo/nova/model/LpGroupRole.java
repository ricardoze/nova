package com.ricardo.nova.model;

import java.io.Serializable;

/**
 * lp_group_role
 * @author 
 */
public class LpGroupRole implements Serializable {
    /**
     * 组角色id
     */
    private Integer groupRoleId;

    /**
     * 组id
     */
    private Integer groupId;

    /**
     * 角色id
     */
    private Integer roleId;

    private static final long serialVersionUID = 1L;

    public Integer getGroupRoleId() {
        return groupRoleId;
    }

    public void setGroupRoleId(Integer groupRoleId) {
        this.groupRoleId = groupRoleId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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
        LpGroupRole other = (LpGroupRole) that;
        return (this.getGroupRoleId() == null ? other.getGroupRoleId() == null : this.getGroupRoleId().equals(other.getGroupRoleId()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGroupRoleId() == null) ? 0 : getGroupRoleId().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", groupRoleId=").append(groupRoleId);
        sb.append(", groupId=").append(groupId);
        sb.append(", roleId=").append(roleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}