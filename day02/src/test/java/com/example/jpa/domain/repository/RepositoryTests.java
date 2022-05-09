package com.example.jpa.domain.repository;

import com.example.jpa.domain.vo.MemberVO;
import com.example.jpa.domain.vo.ProductVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class RepositoryTests {
    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private ProductRepository productRepository;

//    @Test
//    public void saveMemberTest(){
//        String id ="hds1234";
//        String name = "한동석";
//        String birth = "2000-12-04";
//
//        memberRepository.save(MemberVO.builder().memberId(id).memberName(name).memberBirth(birth).build());
//    }

//    상품 한 개 추가
    @Test
    public void saveProductTest(){
        String name = "자동차";
        Long price = 8000L;
        Long stock = 10L;

        productRepository.save(ProductVO.builder().productName(name).productPrice(price).productStock(stock).build());
    }
}














