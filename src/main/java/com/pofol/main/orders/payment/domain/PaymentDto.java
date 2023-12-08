package com.pofol.main.orders.payment.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDto {
    private String pay_id; //결제 id (impxxxx, 포트원에서 제공)
    private Long ord_id; //주문번호
    private String mem_id; //회원id
    private String code_name; //결제상태
    private String tot_prod_name; //총 상품명
    private Integer tot_pay_price; //실 결제 금액
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date pay_date; //결제 일시
    private String pay_way; //결제 방법
    private String rg_num;
    private String md_num;

    private String paid_at; //포트원에서 제공하는 결제일시, DB에는 없음

    public PaymentDto(String pay_id, Long ord_id, String mem_id, String code_name, String tot_prod_name, Integer tot_pay_price, Date pay_date, String pay_way, String rg_num, String md_num) {
        this.pay_id = pay_id;
        this.ord_id = ord_id;
        this.mem_id = mem_id;
        this.code_name = code_name;
        this.tot_prod_name = tot_prod_name;
        this.tot_pay_price = tot_pay_price;
        this.pay_date = pay_date;
        this.pay_way = pay_way;
        this.rg_num = rg_num;
        this.md_num = md_num;
    }
}
