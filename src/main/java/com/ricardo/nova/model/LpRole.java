package com.ricardo.nova.model;

import java.io.Serializable;
import java.util.Date;

/**
 * lp_role
 * @author 
 */
public class LpRole implements Serializable {
    private Integer roleId;

    private Integer parentRightId;

    private String roleName;

    private Date createTime;

    private String roleDescription;

    private static final long serialVersionUID = 1L;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getParentRightId() {
        return parentRightId;
    }

    public void setParentRightId(Integer parentRightId) {
        this.parentRightId = parentRightId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRoleDescription() {
        return roleDescription;
    }

    public void setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
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
        LpRole other = (LpRole) that;
        return (this.getRoleId() == null ? other.getRoleId() == null : this.getRoleId().equals(other.getRoleId()))
            && (this.getParentRightId() == null ? other.getParentRightId() == null : this.getParentRightId().equals(other.getParentRightId()))
            && (this.getRoleName() == null ? other.getRoleName() == null : this.getRoleName().equals(other.getRoleName()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getRoleDescription() == null ? other.getRoleDescription() == null : this.getRoleDescription().equals(other.getRoleDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        result = prime * result + ((getParentRightId() == null) ? 0 : getParentRightId().hashCode());
        result = prime * result + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getRoleDescription() == null) ? 0 : getRoleDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleId=").append(roleId);
        sb.append(", parentRightId=").append(parentRightId);
        sb.append(", roleName=").append(roleName);
        sb.append(", createTime=").append(createTime);
        sb.append(", roleDescription=").append(roleDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}