package com.sms.util.core;

import lombok.Data;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@Data
public class TreeNode<T> implements Serializable {
    private String id;

    private String label;

    private String parantId;

    private T data;

    private List<TreeNode<T>> children=new LinkedList<>();
}
