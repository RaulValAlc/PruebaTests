package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    // ---- TESTS DE CASOS DE EQUIVALENCIA ----

    @Test
    @DisplayName("TC1")
    void tc1_CE13_CE20() {
        Usuario u = new Usuario("abc", "Abcdef12", 18, "usuario@ejemplo.com");
        assertTrue(u.validarRegistro());
    }

    @Test
    @DisplayName("TC2")
    void tc2_CE14_CE22() {
        Usuario u = new Usuario("abc", "ab", 17, "correo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC3")
    void tc3_CE15_CE20() {
        Usuario u = new Usuario("abc", "Abcdef12", 18, "usuario@ejemplo");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC4")
    void tc4_CE19_CE21() {
        Usuario u = new Usuario("abc", null, 17, "@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC5")
    void tc5_CE13_CE20() {
        Usuario u = new Usuario("ab", "Abcdef12", 18, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC6")
    void tc6_CE19_CE20() {
        Usuario u = new Usuario("ab", "Abcdef12", 18, "@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC7")
    void tc7_CE15_CE22() {
        Usuario u = new Usuario("ab", null, 17, "usuario@ejemplo");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC8")
    void tc8_CE13_CE20() {
        Usuario u = new Usuario("abcdef", "Abcdef12", 18, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC9")
    void tc9_CE14_CE21() {
        Usuario u = new Usuario("abcdef", "ab", 17, "correo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC10")
    void tc10_CE13_CE21() {
        Usuario u = new Usuario("abcdef", "Abcdef12", 17, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC11")
    void tc11_CE14_CE20() {
        Usuario u = new Usuario("abcdef", null, 18, "correo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC12")
    void tc12_CE13_CE20() {
        Usuario u = new Usuario("abc123", "Abcdef12", 18, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC13")
    void tc13_CE14_CE21() {
        Usuario u = new Usuario("abc123", "ab", 17, "correo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC14")
    void tc14_CE13_CE20() {
        Usuario u = new Usuario("abc123", "Abcdef12", 18, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC15")
    void tc15_CE15_CE21() {
        Usuario u = new Usuario("abc123", null, 17, "usuario@ejemplo");
        assertFalse(u.validarRegistro());
    }

    // ---- TESTS DE VALORES LÍMITE ----

    @Test @DisplayName("TC16") void TC16() {
        Usuario u = new Usuario("abc", "Abcdef12", 18, "usuario@ejemplo.com");
        assertTrue(u.validarRegistro());
    }

    @Test @DisplayName("TC17") void TC17() {
        Usuario u = new Usuario("abcde", "Abcdef12Abcdef12Abcd", 18, "usuario@ejemplo.com");
        assertTrue(u.validarRegistro());
    }

    @Test @DisplayName("TC18") void TC18() {
        Usuario u = new Usuario("ab", "Abcdef1", 18, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test @DisplayName("TC19") void TC19() {
        Usuario u = new Usuario("abcdef", "Abcdef12Abcdef12Abcde", 18, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test @DisplayName("TC20") void TC20() {
        Usuario u = new Usuario("abcd", "Abcdef12", 19, "usuario@ejemplo.com");
        assertTrue(u.validarRegistro());
    }

    @Test @DisplayName("TC21") void TC21() {
        Usuario u = new Usuario("ab", "Abcdef12Abcdef12Abcd", 19, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test @DisplayName("TC22") void TC22() {
        Usuario u = new Usuario("abcdef", "Abcdef1", 19, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test @DisplayName("TC23") void TC23() {
        Usuario u = new Usuario("abc", "Abcdef12Abcdef12Abcde", 19, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test @DisplayName("TC24") void TC24() {
        Usuario u = new Usuario("ab", "Abcdef12", 17, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test @DisplayName("TC25") void TC25() {
        Usuario u = new Usuario("abc", "Abcdef12Abcdef12Abcd", 17, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test @DisplayName("TC26") void TC26() {
        Usuario u = new Usuario("abcde", "Abcdef1", 17, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test @DisplayName("TC27") void TC27() {
        Usuario u = new Usuario("abcdef", "Abcdef12Abcdef12Abcde", 17, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test @DisplayName("TC28") void TC28() {
        Usuario u = new Usuario("abcdef", "Abcdef12", 0, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test @DisplayName("TC29") void TC29() {
        Usuario u = new Usuario("abc", "Abcdef12Abcdef12Abcd", 0, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test @DisplayName("TC30") void TC30() {
        Usuario u = new Usuario("abcd", "Abcdef1", 0, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test @DisplayName("TC31") void TC31() {
        Usuario u = new Usuario("ab", "Abcdef12Abcdef12Abcde", 0, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test @DisplayName("TC32") void TC32() {
        Usuario u = new Usuario("abcde", "Abcdef12", 18, "usuario@ejemplo.com");
        assertTrue(u.validarRegistro());
    }

    @Test @DisplayName("TC33") void TC33() {
        Usuario u = new Usuario("abc", "Abcdef12Abcdef12Abcd", 19, "usuario@ejemplo.com");
        assertTrue(u.validarRegistro());
    }

    @Test @DisplayName("TC34") void TC34() {
        Usuario u = new Usuario("ab", "Abcdef1", 17, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test @DisplayName("TC35") void TC35() {
        Usuario u = new Usuario("abcdef", "Abcdef12Abcdef12Abcde", 0, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test @DisplayName("TC36") void TC36() {
        Usuario u = new Usuario("abcd", "Abcdef1", 18, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test @DisplayName("TC37") void TC37() {
        Usuario u = new Usuario("abcde", "Abcdef12Abcdef12Abcde", 19, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

}