package com.talent.exception;

/**
 * @author guobing
 * @Title: UserException
 * @ProjectName spring-boot-06-jdbc
 * @Description: TODO
 * @date 2019/1/16下午2:22
 */
public class UserException extends RuntimeException {


    public UserException(String message) {
        super(message);
    }
}
