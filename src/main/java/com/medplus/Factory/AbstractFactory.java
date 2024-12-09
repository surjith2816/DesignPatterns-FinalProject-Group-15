package com.medplus.Factory;

import com.medplus.Builder.BuilderAPI;

public abstract class AbstractFactory<T> {
    public abstract T getObject(BuilderAPI<T> buildObject);

}