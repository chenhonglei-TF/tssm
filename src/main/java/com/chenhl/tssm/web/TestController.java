package com.chenhl.tssm.web;

import com.chenhl.tssm.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @创建人: chenhl
 * @创建时间: 2020/3/12
 * @描述:
 */
@Controller
public class TestController {

    @RequestMapping(value = "baseType.do")
    @ResponseBody
    public String baseType(@RequestParam("xage") int age) {
        return "age: " + age;
    }

    @RequestMapping(value = "baseType2.do")
    @ResponseBody
    public String baseType2(Integer age) {
        return "age: " + age;
    }

    @RequestMapping(value = "array.do")
    @ResponseBody
    public String array(String[] names) {
        StringBuffer sb = new StringBuffer();
        for (String name : names) {
            sb.append(name).append(",");
        }
        return sb.toString();
    }

    @RequestMapping(value = "object.do")
    @ResponseBody
    public String object(User user) {
      return user.toString();
    }

    @RequestMapping(value = "json.do")
    @ResponseBody
    public String json(@RequestBody User user) {
        return user.toString();
    }
}
