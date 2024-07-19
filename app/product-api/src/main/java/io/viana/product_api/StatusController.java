package io.viana.product_api;

import java.util.HashMap;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping("/api")
public class StatusController {

    @Value("${spring.app.name}")
    private String webApplicationName;

    @GetMapping("status")
    public ResponseEntity<HashMap<String, Object>> getApiStatus() {
        var response = new HashMap<String, Object>();
        response.put("service", "Product-API");
        response.put("status", "up");
        response.put("httpStatus", 200);
        return ResponseEntity.ok(response);
    }
}
