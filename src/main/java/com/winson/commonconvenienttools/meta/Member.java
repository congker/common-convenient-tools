package com.winson.commonconvenienttools.meta;


import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
public class Member {
    @Excel(name = "ID", width = 10)
    private Long id;
    @Excel(name = "用户名", width = 20, needMerge = true)
    private String username;
    @Excel(name = "密码", width = 20)
    private String password;
    @Excel(name = "昵称", width = 20, needMerge = true)
    private String nickname;
    @Excel(name = "出生日期", width = 20, format = "yyyy-MM-dd")
    private Date birthday;
    @Excel(name = "手机号", width = 20, needMerge = true, desensitizationRule = "3_4")
    private String phone;
    private String icon;
    @Excel(name = "性别", width = 10, replace = {"男_0", "女_1"})
    private Integer gender;

}
