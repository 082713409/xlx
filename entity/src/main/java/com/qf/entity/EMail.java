package com.qf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author X
 * @Date 2019/7/1 0:02
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EMail implements Serializable {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String mail;
}
