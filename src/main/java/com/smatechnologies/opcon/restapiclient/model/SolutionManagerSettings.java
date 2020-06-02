package com.smatechnologies.opcon.restapiclient.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


/**
 * @author Pierre PINON
 */
public class SolutionManagerSettings {

    public static final String RESOURCE = "solutionManagerSettings";

    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_USER_ID = "userId";
    public static final String PROPERTY_ROLE_ID = "roleId";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_VALUE = "value";
    public static final String PROPERTY_PUBLIC = "public";
    public static final String PROPERTY_USER_CAN_WRITE = "userCanWrite";

    private Integer id;
    private Integer userId;
    private Integer roleId;
    private String name;
    private String value;
    @JsonProperty("public")
    private Boolean isPublic;
    private Boolean userCanWrite;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getPublic() {
        return isPublic;
    }

    public void setPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public Boolean getUserCanWrite() {
        return userCanWrite;
    }

    public void setUserCanWrite(Boolean userCanWrite) {
        this.userCanWrite = userCanWrite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        SolutionManagerSettings that = (SolutionManagerSettings) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(roleId, that.roleId) &&
                Objects.equals(name, that.name) &&
                Objects.equals(value, that.value) &&
                Objects.equals(isPublic, that.isPublic) &&
                Objects.equals(userCanWrite, that.userCanWrite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userId, roleId, name, value, isPublic, userCanWrite);
    }
}
