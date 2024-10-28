package hello.coree;

import hello.coree.discount.DiscountPolicy;
import hello.coree.discount.FixDiscountPolicy;
import hello.coree.discount.RateDiscountPolicy;
import hello.coree.member.MemberRepository;
import hello.coree.member.MemberService;
import hello.coree.member.MemberServiceImpl;
import hello.coree.member.MemoryMemberRepository;
import hello.coree.order.OrderService;
import hello.coree.order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {


    @Bean
    public MemberService memberService() {
        System.out.println("call AppConfig.memberService");
        return  new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemoryMemberRepository memberRepository() {
        System.out.println("call AppConfig.memberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
        System.out.println("call AppConfig.orderService");
       return new OrderServiceImpl( memberRepository(), discountPolicy());
     //   return  null;
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        // return new FixDiscountPolicy();
        return  new RateDiscountPolicy();
    }
}
