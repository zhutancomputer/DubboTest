package cn.zhutan.dubbo.api.model;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    private long id;
    private String username;
}
