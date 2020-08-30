package org.ph.provider.annotation;

import org.ph.provider.selector.TestImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author ph
 * @description 一个ImportSelector的测试注解
 * @date 2020/8/30
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(TestImportSelector.class)
public @interface ImportService {
}
