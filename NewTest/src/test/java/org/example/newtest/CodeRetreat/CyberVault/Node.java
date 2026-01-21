package org.example.newtest.CodeRetreat.CyberVault;

import java.util.ArrayList;
import java.util.List;

abstract class Node {
    protected String id;
    protected List<Vault> vaults = new ArrayList<>();

    public Node(String id) {
        this.id = id;
    }

    public abstract void scan();
}