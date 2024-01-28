package com.example.server.mapper;

public interface BaseEntityMapper<DOMAIN, ENTITY> {
    public DOMAIN toDomain(ENTITY entity);
    public ENTITY toEntity(DOMAIN domain);
}
