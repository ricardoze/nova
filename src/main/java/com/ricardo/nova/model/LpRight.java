package com.ricardo.nova.model;

import java.io.Serializable;

/**
 * lp_right
 * @author 
 */
public class LpRight implements Serializable {
    private Integer rightId;

    private Integer parentRightId;

    private String rightName;

    private String rightDescription;

    private static final long serialVersionUID = 1L;

    public Integer getRightId() {
        return rightId;
    }

    public void setRightId(Integer rightId) {
        this.rightId = rightId;
    }

    public Integer getParentRightId() {
        return parentRightId;
    }

    public void setParentRightId(Integer parentRightId) {
        this.parentRightId = parentRightId;
    }

    public String getRightName() {
        return rightName;
    }

    public void setRightName(String rightName) {
        this.rightName = rightName;
    }

    public String getRightDescription() {
        return rightDescription;
    }

    public void setRightDescription(String rightDescription) {
        this.rightDescription = rightDescription;
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
        LpRight other = (LpRight) that;
        return (this.getRightId() == null ? other.getRightId() == null : this.getRightId().equals(other.getRightId()))
            && (this.getParentRightId() == null ? other.getParentRightId() == null : this.getParentRightId().equals(other.getParentRightId()))
            && (this.getRightName() == null ? other.getRightName() == null : this.getRightName().equals(other.getRightName()))
            && (this.getRightDescription() == null ? other.getRightDescription() == null : this.getRightDescription().equals(other.getRightDescription()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRightId() == null) ? 0 : getRightId().hashCode());
        result = prime * result + ((getParentRightId() == null) ? 0 : getParentRightId().hashCode());
        result = prime * result + ((getRightName() == null) ? 0 : getRightName().hashCode());
        result = prime * result + ((getRightDescription() == null) ? 0 : getRightDescription().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rightId=").append(rightId);
        sb.append(", parentRightId=").append(parentRightId);
        sb.append(", rightName=").append(rightName);
        sb.append(", rightDescription=").append(rightDescription);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}