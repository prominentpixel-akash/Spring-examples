package com.prominentpixel.controller;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.prominentpixel.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private Gson gson;

    @RequestMapping("/getStudents")
    public List<Student> getStudents() {
        return Student.getStudent();
    }


//    @Bean
//    @ConditionalOnMissingBean
//    public GsonBuilder gsonBuilder(List<GsonBuilderCustomizer> customizers) {
//        GsonBuilder builder = new GsonBuilder();
//        customizers.forEach((c) -> c.customize(builder));
//        return builder;
//    }
//
//    @Bean
//    @ConditionalOnMissingBean
//    public Gson gson(GsonBuilder gsonBuilder) {
//        return gsonBuilder.create();
//    }
//
//    @Bean
//    public StandardGsonBuilderCustomizer standardGsonBuilderCustomizer(GsonProperties gsonProperties) {
//        return new StandardGsonBuilderCustomizer(gsonProperties);
//    }
//    static final class StandardGsonBuilderCustomizer implements GsonBuilderCustomizer, Ordered {
//
//        private final GsonProperties properties;
//
//        StandardGsonBuilderCustomizer(GsonProperties properties) {
//            this.properties = properties;
//        }
//
//        @Override
//        public int getOrder() {
//            return 0;
//        }
//
//        @Override
//        public void customize(GsonBuilder builder) {
//            GsonProperties properties = this.properties;
//            PropertyMapper map = PropertyMapper.get().alwaysApplyingWhenNonNull();
//            map.from(properties::getGenerateNonExecutableJson).toCall(builder::generateNonExecutableJson);
//            map.from(properties::getExcludeFieldsWithoutExposeAnnotation)
//                    .toCall(builder::excludeFieldsWithoutExposeAnnotation);
//            map.from(properties::getSerializeNulls).whenTrue().toCall(builder::serializeNulls);
//            map.from(properties::getEnableComplexMapKeySerialization).toCall(builder::enableComplexMapKeySerialization);
//            map.from(properties::getDisableInnerClassSerialization).toCall(builder::disableInnerClassSerialization);
//            map.from(properties::getLongSerializationPolicy).to(builder::setLongSerializationPolicy);
//            map.from(properties::getFieldNamingPolicy).to(builder::setFieldNamingPolicy);
//            map.from(properties::getPrettyPrinting).toCall(builder::setPrettyPrinting);
//            map.from(properties::getLenient).toCall(builder::setLenient);
//            map.from(properties::getDisableHtmlEscaping).toCall(builder::disableHtmlEscaping);
//            map.from(properties::getDateFormat).to(builder::setDateFormat);
//        }
//    }
}

