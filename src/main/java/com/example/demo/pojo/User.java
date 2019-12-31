package com.example.demo.pojo;

import com.example.demo.annotation.MyFormValidator;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Data
@Component
public class User {

    @NotEmpty(message = "ID不能为空")
    @NotBlank(message = "ID不能为空")
    @MyFormValidator(value = "abc",message = "dd")
    @Value("${user.id}")
    private int id;

    @Min(value = 18)
    @Max(value = 100)
    @Value("${user.age}")
    private Integer age;

    @NotEmpty(message = "昵称不能为空")
    @NotBlank(message = "昵称不能为空")
    @Value("${user.login_name}")
    private String loginName;

    @NotEmpty(message = "出生日期不能为空")
    @NotBlank(message = "出生日期不能为空")
    @Value("${user.login_time}")
    private String loginTime;

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

    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
