package com.courses.factory;

/**
 * IBaseFactory Interface
 * Yevhen Ivanov, 2018-05-08
 */
public interface IBaseFactory {
    ICircle createCircle();
    ITriangle createTriangle();
}
