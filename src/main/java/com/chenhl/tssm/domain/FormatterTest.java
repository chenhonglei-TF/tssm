package com.chenhl.tssm.domain;

import org.springframework.format.number.CurrencyFormatter;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;

/**
 * @创建人: chenhl
 * @创建时间: 2020/3/12
 * @描述:
 */
public class FormatterTest {

    public static void main(String[] args) throws Exception {
        test1();
        System.out.println("=======");
        test2();
    }

    public static void test1() throws Exception {
        CurrencyFormatter currencyFormatter = new CurrencyFormatter();
        currencyFormatter.setFractionDigits(2);// 表示保留2位
        currencyFormatter.setRoundingMode(RoundingMode.CEILING);//表示四舍五入
        BigDecimal b = new BigDecimal("123.13");
        BigDecimal parse = currencyFormatter.parse("$123.125", Locale.US);
        System.out.println(parse);
        System.out.println(b.compareTo(parse)==0);
    }

    public static void test2() throws Exception {
        CurrencyFormatter currencyFormatter = new CurrencyFormatter();
        currencyFormatter.setFractionDigits(2);// 表示保留2位
        currencyFormatter.setRoundingMode(RoundingMode.CEILING);//表示四舍五入
        String s = "$123.00";
        String s1 = currencyFormatter.print(new BigDecimal("123"), Locale.US);
        System.out.println(s1);
        System.out.println(s.equals(s1));
    }
}
