package com.example.demo.pojo;

import com.example.demo.annotation.MyFormValidator;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
public class User {

    @NotEmpty(message = "ID不能为空")
    @NotBlank(message = "ID不能为空")
    @MyFormValidator(value = "abc",message = "dd")
    private int id;

    @Min(value = 18)
    @Max(value = 100)
    private Integer age;

    @NotEmpty(message = "昵称不能为空")
    @NotBlank(message = "昵称不能为空")
    private String loginName;

    private Date loginTime;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
