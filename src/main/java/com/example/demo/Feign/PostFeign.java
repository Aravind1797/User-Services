package com.example.demo.Feign;

import com.example.demo.model.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.ws.rs.POST;
import java.util.List;

@FeignClient(name="Account",fallbackFactory =HystrixFallbackFactorty.class,configuration ={POSTRetryClientConfig.class})


public interface PostFeign {

    @GetMapping("/posts/post/{id}/")
    public ResponseEntity<Post> getPostDetails();
}



}
