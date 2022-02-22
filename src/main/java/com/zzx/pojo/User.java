package com.zzx.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @Author zzx
 * @Date 2021/7/20 14:41
 **/
@ApiModel(value = "用户实体类")
public class User {
    @ApiModelProperty(name = "id",dataType = "Integer",required = true)
    private Integer id;
    @ApiModelProperty(name = "name",dataType = "String",required = true)
    private String name;
    @ApiModelProperty(name = "age",dataType = "Integer",required = true)
    private Integer age;
    @ApiModelProperty(name = "email",dataType = "String",required = true)
    private String email;
    @ApiModelProperty(name = "statue",dataType = "Integer",required = true)
    private Integer statue;

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", statue=" + statue +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatue() {
        return statue;
    }

    public void setStatue(Integer statue) {
        this.statue = statue;
    }
}
