package com.itheima.controller;

import org.apache.ibatis.io.ResolverUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-10-16 09:58:48
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RestControllerAdvice
public class ExceptionHandlerForAnimeInfo {
    @ExceptionHandler(Exception.class)
    public Result doException(Exception ex){
        return new Result(Code.GET_EXCEPTION,"异常了喔...🎃🎃🎃",null);
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException bx){
        return new Result(Code.GET_EXCEPTION,bx.getMessage(),null);
    }

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException sx){
        return new Result(Code.GET_EXCEPTION,sx.getMessage(),null);
    }


}
