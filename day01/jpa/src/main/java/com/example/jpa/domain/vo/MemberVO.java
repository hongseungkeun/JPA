package com.example.jpa.domain.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "TBL_MEMBER")
@SequenceGenerator(name = "SEQ_MEMBER", allocationSize = 1)
@Getter
@ToString
@NoArgsConstructor
public class MemberVO {
    @Id
    @Column(name = "MEMBER_NUMBER")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_MEMBER")
    private Long memberNumber;
    @Column(name = "MEMBER_ID")
    private String memberId;
    @Column(name = "MEMBER_NAME")
    private String memberName;
    @Column(name = "MEMBER_BIRTH")
    private String memberBirth;

    @Builder
    public MemberVO(Long memberNumber, String memberId, String memberName, String memberBirth) {
        this.memberNumber = memberNumber;
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberBirth = memberBirth;
    }
}














