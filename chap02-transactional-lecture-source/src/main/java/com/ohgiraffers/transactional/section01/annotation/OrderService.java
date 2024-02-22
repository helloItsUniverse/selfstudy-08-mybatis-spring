package com.ohgiraffers.transactional.section01.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderService {

    private OrderMapper orderMapper;

    private MenuMapper menuMapper;

    // 의존성 주입 받아오기
    @Autowired
    public OrderService(OrderMapper orderMapper, MenuMapper menuMapper) {
        this.orderMapper = orderMapper;
        this.menuMapper = menuMapper;
    }


    /* 설명.
     *  OrderDTO 에 담겨 있을 내용
     *  : Service 계층부터 개발할 때는 사용자가 입력한 값들이
     *    어떻게 DTO 도는 Map 으로 묶여서 Service 로 넘어올지 충분히 고민한 후 매개변수를 작성하고 개발한다.
     *    현재의 경우 사용자가 고른 메뉴들 각각의
     *    1)코드 번호와 2)고른 메뉴 개수, 그리고 3)서버의 현재시간이 담긴 채로 넘어왔다는 생각을 가지고 개발해 나가자.
    * */
    public void registNewOrder(OrderDTO orderInfo) {

        /* 설명. 1. 주문한 메뉴 코드 추출(DTO에서) */
        List<Integer> menuCode = orderInfo
                .getOrderMenus()
                .stream()
                .map(OrderMenuDTO::getMenuCode)
                .collect(Collectors.toList());

//        List<Integer> menuCode = new ArrayList<>();
//        List<OrderMenuDTO> orderMenus = orderInfo.getOrderMenus();
//        for (OrderMenuDTO orderMenu : orderMenus) {
//            menuCode.add(orderMenu.getMenuCode());
//        }

        System.out.println("menuCode = " + menuCode);

        /* 설명. 2. 주문한 메뉴 별로 Menu 엔티티에 담아서 조회(select)해 오기(부가적인 메뉴의 정보 추출) */

        /* 설명. 3. 이 주문 건에 대한 주문 총 합계를 계산 */

        /* 설명. 4. 1~3까지 하면 tbl_order 테이블에 추가(insert)이 가능하다. */

        /* 설명. 5. tbl_order_menu 에도 주문한 메뉴 갯수만큼 추가(insert)한다. */

    }

}
