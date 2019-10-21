package com.mycompany.hibernate_inheritance_join;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity  
@Data
@EqualsAndHashCode(callSuper = false)
@Table(name="CONTRACT_EMPLOYEE")   
@PrimaryKeyJoinColumn(name = "ID")

public class ContractEmployee extends Employee{
 
 @Column(name="pay_per_hour")
 private float pay_per_hour;
 
 @Column(name="contract_duration")
 private String contract_duration;

}

