package com.massmutual.coe.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class Associate {

    String assocName;
    String assocEmail;

    String assocId;

    Associate manager;
}
