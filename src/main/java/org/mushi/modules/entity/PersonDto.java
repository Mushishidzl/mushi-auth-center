//package org.mushi.modules.entity;
//
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.ToString;
//import org.apache.commons.lang.StringUtils;
//
//import java.util.Optional;
//
//@Data
//@EqualsAndHashCode(exclude={"self"})
//@ToString(callSuper=true, exclude="self")
//public class PersonDto {
//
//    private Integer id;
//
//    private String name;
//
//    private String password;
//
//
//    private Double self;
//
//    public boolean validateName1() {
//        return StringUtils.equals("hjz", name);
//    }
//
//    public static boolean validateName2(String name) {
//        return StringUtils.equals("hjz", name);
//    }
//
//    public static void main(String[] args) {
//        String ceshi = String.format("用户信息为空 %s", "ceshi");
//        System.out.println(ceshi);
////        PersonDto personDto = new PersonDto();
////        personDto.setName("hjz");
////
////
////        String name = Optional.ofNullable(personDto)
////                .filter(PersonDto::validateName1)
////                .map(obj -> obj.getName())
////                .orElseThrow(()->new IllegalArgumentException("The value of param personDto isn't available."));
////        String password = Optional.ofNullable(personDto)
////                .filter(PersonDto::validateName1)
////                .map(obj -> obj.getPassword())
////                .orElseThrow(() -> new IllegalArgumentException("The value of param personDto isn't available."));
////
////        System.out.println(name);
////        System.out.println(password);
//    }
//}
//
//
//
//
//
//
////        String name = Optional.ofNullable(personDto)
////                .map(obj -> obj.getName())
////                .filter(StringUtils::isNotEmpty)
////                .orElseThrow(()->new IllegalArgumentException("The value of param personDto isn't available."));
//
////        String name = Optional.ofNullable(personDto)
////                .map(obj -> obj.getName())
////                .filter(PersonDto::validateName2)
////                .orElseThrow(()->new IllegalArgumentException("The value of param personDto isn't available."));
//
