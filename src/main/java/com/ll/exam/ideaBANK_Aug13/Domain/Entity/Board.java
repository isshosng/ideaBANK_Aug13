package com.ll.exam.ideaBANK_Aug13.domain.entity;


import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class) /* JPA에게 해당 Entity는 Auditing 기능을 사용함을 알림 */
public class Board {

    @Id
    @GeneratedValue
    private Long id;

    @Column(length = 100, nullable = false)
    private String title; // 제목

    @Column(length = 10, nullable = false)
    private String storeType; // 가게유형

    @Column(length = 10, nullable = false)
    private String storeName; // 상호명

    @Column(length = 10, nullable = false)
    private String orderDetail; // 주문내용

    @Column(length = 10, nullable = false)
    private String minimumOrderAmount; // 최소주문금액

    @Column(length = 10, nullable = false)
    private String deliveryCharge; // 배달요금

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content; // 기타사항

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;

    @Builder
    public Board(Long id, String title, String storeType,
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
