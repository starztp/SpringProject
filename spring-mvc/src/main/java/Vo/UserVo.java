package Vo;

import entity.Address;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

//用来接收页面传过来的数据
public class UserVo {

    //NotEmpty进行非空校验
    @NotEmpty(message = "用户名不能为空")
    private String username;
    private String password;
    private String phone;
    private String email;
    //给age参数加了范围限制，message表示超出限制后的报错信息
    @Range(min = 1,max = 18,message = "大于18岁的老腊肉，啦啦啦")
    private int age;
    private Address address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserVo{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
