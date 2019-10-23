package com.ad.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author AdrainHuang
 * @Date 2019/10/13 18:28
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	private Long id;
	private String username;
}
