package com.sast.astbenchmark.cases.completeness.base.chain.astTaint;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Introduction 污点链路样本中的表达式-new操作+数组对象
 * Level X
 * Date 2024-05-09
 */
// assession information start
// real vulnerability = true
// assession project = 完整度->基础跟踪能力->污点链路完整度->ast对象->new操作+数组对象
// compose = Expression_NewExpression_Array_001_T.java
// bind_url = completeness/base/chain/astTaint/Expression_NewExpression_Array_001_T
// assession information end
@RestController()
@RequestMapping("completeness/base/chain/astTaint")
public class Expression_NewExpression_Array_001_T {
    @PostMapping(value = "Expression_NewExpression_Array_001_T")
    public Map<String, Object> aTaintCase0195(@RequestParam String[] cmd) {
        Map<String, Object> modelMap = new HashMap<>();
        try {
            String[] chars = new String[]{cmd[0],cmd[1]};
            Runtime.getRuntime().exec(chars);
            modelMap.put("status", "success");
        } catch (Exception e) {
            modelMap.put("status", "error");
        }
        return modelMap;
    }
}
