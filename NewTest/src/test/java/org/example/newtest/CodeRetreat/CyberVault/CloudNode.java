package org.example.newtest.CodeRetreat.CyberVault;

class CloudNode extends Node {
    public CloudNode() {
        super("CLOUD-99");
    }

    @Override
    public void scan() {
        System.out.println(">>> " + id + " <<<");
        vaults.forEach(v -> System.out.println(" [CLOUD] " + v));
        System.out.println("════════════════");
    }

    public void add(Vault v) {
        vaults.add(v);
    }
}