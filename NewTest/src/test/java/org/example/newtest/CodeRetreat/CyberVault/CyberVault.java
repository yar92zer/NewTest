package org.example.newtest.CodeRetreat.CyberVault;

import java.util.*;

public class CyberVault {
    public static void main(String[] args) {
        Map<String, Node> network = new LinkedHashMap<>();
        Set<String> hackers = new HashSet<>();

        Vault v1 = new Vault("root", "password123");
        Vault v2 = new Vault("admin", "flag{root_access}");

        v1.hack();
        v2.hack();

        ServerNode server = new ServerNode();
        CloudNode cloud = new CloudNode();

        server.add(v1);
        cloud.add(v2);


        Node n1 = server;
        Node n2 = cloud;

        network.put("LOCAL", server);
        network.put("CLOUD", cloud);

        hackers.add(v1.getOwner());
        hackers.add(v2.getOwner());

        System.out.println("╔════════════════════════════════╗");
        System.out.println("║        CYBERVAULT v2.0         ║");
        System.out.println("║     SCANNING NETWORK...        ║");
        System.out.println("╚════════════════════════════════╝");

        network.values().forEach(Node::scan);

        System.out.println("\n[INFO] Уникальные пользователи: " + hackers);
        System.out.println("[INFO] Всего хранилищ: " + Vault.getTotal());
        System.out.println("[SUCCESS] Взлом завершён.");
    }
}