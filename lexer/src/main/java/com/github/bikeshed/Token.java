package com.github.bikeshed;

import org.immutables.value.Value;

@Value.Immutable
@ImmutableBikeshedValue
public interface Token {
    TokenType getType();
    Position getOriginalPosition();
}
