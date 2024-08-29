package com.example.l03_jdbc_di.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter@Setter // 자동으로 컴파일할때 게터, 세터 정의함 (lombok이)
@ToString // toString도 해줌 (lombok이)
public class Customer {
    private int customerId;
    private String customerName;
    private String customerEmail;
    private String customerPhone;


}
