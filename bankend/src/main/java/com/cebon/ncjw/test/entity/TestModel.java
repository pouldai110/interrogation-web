package com.cebon.ncjw.test.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name="test_model")
@Entity
public class TestModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Column(name = "username")
    @Getter
    @Setter
    private String userName = "admin" ;

    @Column(name = "password")
    @Getter
    @Setter
    @Builder.Default
    private String password = "123456";

    public enum  userRole {
        DEFAULT_ADMIN(1,"defalut_admin"),
        ADMIN(2,"admin"),
        USRER(3, "user");

        private Integer roleNum;
        private String roleName;
        userRole(Integer roleNum, String roleName) {
            this.roleNum = roleNum;
            this.roleName = roleName;
        }
    }
    @Column(name = "role")
    @Getter
    @Setter
    @Builder.Default
    private userRole role = userRole.ADMIN;
}
