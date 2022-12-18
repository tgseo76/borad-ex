package com.likelion.springbootboard.domain.entity;

import com.likelion.springbootboard.domain.dto.MemberDto;
import com.sun.istack.NotNull;
import com.sun.istack.Nullable;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberNum;
    @Column(unique = true,nullable = false)
    private String id;
    @NotNull
    private String password;
    @NotNull
    private String name;
    @ColumnDefault("'user'")
    private String role;


}
