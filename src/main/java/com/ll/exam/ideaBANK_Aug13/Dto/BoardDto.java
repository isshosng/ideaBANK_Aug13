package com.ll.exam.ideaBANK_Aug13.Dto;
import com.ll.exam.ideaBANK_Aug13.domain.entity.Board;
import lombok.*;

import java.time.LocalDateTime;

/*
Controller와 Service 사이에서 데이터를 주고 받는 DTo(Data Access Object)를 구현합니다.

Dto 패키지를 만들고, 그 안에 BoardDto 클래스를 만들어줍니다.
아래 코드의 toEntity()는 DTO에서 필요한 부분을 빌더 패턴을 통해 Entity로 만드는 일을 합니다.
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardDto {
    private Long id;
    private String title; // 제목
    private String storeType; // 가게유형
    private String storeName; // 상호명
    private String orderDetail; // 주문내용
    private String minimumOrderAmount; // 최소주문금액
    private String deliveryCharge; // 배달요금
    private String content; // 기타사항
    private LocalDateTime createdDate; // 올린시각

    private LocalDateTime modifiedDate; // 수정시각

    public Board toEntity() {
        Board build = Board.builder()
                .id(id)
                .title(title)
                .storeType(storeType)
                .storeName(storeName)
                .orderDetail(orderDetail)
                .minimumOrderAmount(minimumOrderAmount)
                .deliveryCharge(deliveryCharge)
                .content(content)
                .createdDate(createdDate)
                .modifiedDate(modifiedDate)
                .build();
        return build;
    }

    @Builder
    public BoardDto(Long id, String title, String storeType,
                    String storeName, String orderDetail,
                    String minimumOrderAmount,
                    String deliveryCharge, String content,
                    LocalDateTime createdDate,
                    LocalDateTime modifiedDate){
        this.id = id;
        this.title = title;
        this.storeType = storeType;
        this.storeName = storeName;
        this.orderDetail = orderDetail;
        this.minimumOrderAmount = minimumOrderAmount;
        this.deliveryCharge = deliveryCharge;
        this.content = content;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
    }
}
