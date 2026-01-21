package org.example.newtest.CodeRetreat.KingTalsaSecure;

import java.util.Objects;

class King {
    private final String name;
    private final String secretCode;

    public King(String name, String secretCode) {
        this.name = name;
        this.secretCode = secretCode;
    }

    public String getName() {
        return name;
    }

    public void activate(String inputCode) throws AccessDeniedException {
        if (!secretCode.equals(inputCode)) {
            throw new AccessDeniedException("ДОСТУП ЗАПРЕЩЁН! Код неверный для " + name);
        }
        System.out.println(">>> " + name + " - Карали Талсы активированы!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof King)) return false;
        King king = (King) o;
        return name.equals(king.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Король[" + name + "]";
    }
}