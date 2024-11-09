package com.devgol.literalura.service;

public interface InterfaceConvert {
    <T> T obterDados(String json, Class<T> classe);
}
