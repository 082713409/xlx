package com.qf.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author X
 * @Date 2019/6/30 20:53
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private String password;

    private String phone;

    private Integer mailid;

    @TableField(exist = false)
    private EMail eMail;
}
