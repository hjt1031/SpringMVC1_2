package hello.servlet.web.frontcontroller.v3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.annotation.WebServlet;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;

@RestController
public class ResultController {
    @GetMapping("/hello/test")
    public void result() {
        //결과 값
        String result7;
        // 맨처음 소수점 구분 소수 면 몇 1째자리인지 2째자리인지 구분 3째자리부터 절삭
         BigDecimal money = new BigDecimal("7567.5753");
         String result5 = String.valueOf(money.setScale(2, BigDecimal.ROUND_DOWN));

         // 소수점 뒷자리중 앞자리가 0 leading zero 일때 삭제
        String result6 = result5.substring(result5.length()-2,result5.length()).replaceFirst("^0+(?!$)", "");

        // 콤마 찍기
        result7 = result5.substring(0,result5.length()-3).replaceAll("\\B(?=(\\d{3})+(?!\\d))", ",");

        // 금액이 조 넘으면
        if(result7.length() > 5) {
            result7 = result7.substring(0,result7.length()-4) + "조" + result7.substring(result7.length()-5,result7.length()) +"억";
        } else {
            result7 += "억";
        }

        if(!result6.equals("0")) {
            result7 += result6 + "백만원";
        }else{
            result7 += "원";
        }

    }
}
