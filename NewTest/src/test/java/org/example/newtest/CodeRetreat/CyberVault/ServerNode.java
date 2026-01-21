package org.example.newtest.CodeRetreat.CyberVault;

class ServerNode extends Node {
    public ServerNode() {
        super("SERVER-01");
    }

    @Override
    public void scan() {
        System.out.println("╔══ " + id + " ══╗");
        vaults.forEach(v -> System.out.println("║ " + v + " ║"));
        System.out.println("╚═══════════════╝");
    }

    public void add(Vault v) {
        vaults.add(v);
    }
}