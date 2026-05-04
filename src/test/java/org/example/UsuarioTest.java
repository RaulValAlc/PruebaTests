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

    @Test
    @DisplayName("TC16")
    void tc16_VL01_VL05() {
        Usuario u = new Usuario("abc", "Abcdef12", 18, "usuario@ejemplo.com");
        assertTrue(u.validarRegistro());
    }

    @Test
    @DisplayName("TC17")
    void tc17_VL01_VL06() {
        Usuario u = new Usuario("abc", "Abcdef12Abcdef12Abcd", 18, "usuario@ejemplo.com");
        assertTrue(u.validarRegistro());
    }

    @Test
    @DisplayName("TC18")
    void tc18_VL01_VL07() {
        Usuario u = new Usuario("abc", "Abcdef1", 18, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC19")
    void tc19_VL01_VL08() {
        Usuario u = new Usuario("abc", "Abcdef12Abcdef12Abcde", 18, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC20")
    void tc20_VL02_VL05() {
        Usuario u = new Usuario("abc", "Abcdef12", 19, "usuario@ejemplo.com");
        assertTrue(u.validarRegistro());
    }

    @Test
    @DisplayName("TC21")
    void tc21_VL02_VL06() {
        Usuario u = new Usuario("abc", "Abcdef12Abcdef12Abcd", 19, "usuario@ejemplo.com");
        assertTrue(u.validarRegistro());
    }

    @Test
    @DisplayName("TC22")
    void tc22_VL02_VL07() {
        Usuario u = new Usuario("abc", "Abcdef1", 19, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC23")
    void tc23_VL02_VL08() {
        Usuario u = new Usuario("abc", "Abcdef12Abcdef12Abcde", 19, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC24")
    void tc24_VL03_VL05() {
        Usuario u = new Usuario("abc", "Abcdef12", 17, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC25")
    void tc25_VL03_VL06() {
        Usuario u = new Usuario("abc", "Abcdef12Abcdef12Abcd", 17, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC26")
    void tc26_VL03_VL07() {
        Usuario u = new Usuario("abc", "Abcdef1", 17, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC27")
    void tc27_VL03_VL08() {
        Usuario u = new Usuario("abc", "Abcdef12Abcdef12Abcde", 17, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC28")
    void tc28_VL04_VL05() {
        Usuario u = new Usuario("abc", "Abcdef12", 0, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC29")
    void tc29_VL04_VL06() {
        Usuario u = new Usuario("abc", "Abcdef12Abcdef12Abcd", 0, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC30")
    void tc30_VL04_VL07() {
        Usuario u = new Usuario("abc", "Abcdef1", 0, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

    @Test
    @DisplayName("TC31")
    void tc31_VL04_VL08() {
        Usuario u = new Usuario("abc", "Abcdef12Abcdef12Abcde", 0, "usuario@ejemplo.com");
        assertFalse(u.validarRegistro());
    }

}