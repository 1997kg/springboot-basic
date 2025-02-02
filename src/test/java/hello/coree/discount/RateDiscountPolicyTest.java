package hello.coree.discount;

import hello.coree.member.Grade;
import hello.coree.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();


    @Test
    @DisplayName("VIP는 10& 할인이 적용되어야 한다")
    void vip_o (){
        //given
        Member member = new Member(1L, "memberVIP", Grade.VIP);
        //when
        int discount =discountPolicy.discount(member, 10000);
        //then
        Assertions.assertThat(discount).isEqualTo(1000);


    }

    @Test
    @DisplayName("VIP는 아니면 할인x")
    void vip_x (){
        //given
        Member member = new Member(2L, "memberBASIC", Grade.BASIC);
        //when
        int discount =discountPolicy.discount(member, 10000);
        //then
        Assertions.assertThat(discount).isEqualTo(0);


    }

}
