package com.fullstack.projectmanagementbackend.dozerconfig;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class MappingConfiguration {

   /* @Bean
    public DozerBeanMapperFactoryBean dozerBeanMapperFactoryBean(@Value("classpath*:mappings.xml") Resource[] resources) throws Exception {
        final DozerBeanMapperFactoryBean dozerBeanMapperFactoryBean = new DozerBeanMapperFactoryBean();
        // Other configurations
        dozerBeanMapperFactoryBean.setMappingFiles(resources);
        return dozerBeanMapperFactoryBean;
    }*/


    @Bean
    public Mapper mapper(@Value(value = "classpath*:mapper-dozer.xml") Resource[] resourceArray) throws IOException {
        List<String> mappingFileUrlList = new ArrayList<>();
        for (Resource resource : resourceArray) {
            mappingFileUrlList.add(String.valueOf(resource.getURL()));
        }
        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
        dozerBeanMapper.setMappingFiles(mappingFileUrlList);
        return dozerBeanMapper;
    }
}