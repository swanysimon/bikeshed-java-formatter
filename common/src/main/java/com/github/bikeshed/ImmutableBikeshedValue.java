package com.github.bikeshed;

import org.immutables.value.Value;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@Value.Style(
        builderVisibility = Value.Style.BuilderVisibility.PACKAGE
        , defaultAsDefault = true
        , get = {"get*", "is*", "should*"}
        , optionalAcceptNullable = true
        , visibility = Value.Style.ImplementationVisibility.PRIVATE
)
public @interface ImmutableBikeshedValue { }
