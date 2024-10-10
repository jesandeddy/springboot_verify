package com.json007.mapstruct.extend;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.Mappings;

import java.util.Collection;
import java.util.List;

/**
 * @author: chao.an
 * @since: 2024-09-29 14:53
 */
public interface BasicConvertObject <SOURCE,TARGET>{

    @Mappings({})
    @InheritConfiguration
    TARGET toConvert(SOURCE source);

    @InheritConfiguration
    List<TARGET> toConvertVOList(Collection<SOURCE> source);
}
