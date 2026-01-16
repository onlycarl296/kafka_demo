package com.demo.statistic.entity;

import java.util.Date;

import lombok.Data;
import lombok.ToString;
@Data
@ToString
public class StatisticDTO {

    private Integer id;
    private String message;
    private Date createdDate;
    private boolean status;

}