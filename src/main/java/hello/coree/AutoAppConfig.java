package hello.coree;

import hello.coree.discount.DiscountPolicy;
import hello.coree.member.MemberRepository;
import hello.coree.member.MemoryMemberRepository;
import hello.coree.order.OrderService;
import hello.coree.order.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(

        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

//    @Bean(name ="memoryMemberRepository")
//    MemberRepository memoryMemberRepository() {
//        return new MemoryMemberRepository();
//    }

}
