package io.ashimjk.actuator.prometheus.beneficiary;

import lombok.Data;

import java.io.Serializable;

@Data
public class Beneficiary implements Serializable {

    private static final long serialVersionUID = -6105720962195508153L;

    private Integer id;
    private String name;

    public static Beneficiary create(Integer id, String name) {
        Beneficiary beneficiary = new Beneficiary();
        beneficiary.id = id;
        beneficiary.name = name;
        return beneficiary;
    }

}
