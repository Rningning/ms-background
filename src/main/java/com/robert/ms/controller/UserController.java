package com.robert.ms.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.robert.ms.domain.User;
import com.robert.ms.dto.ResponseDto;
import com.robert.ms.dto.UserQueryDto;
import com.robert.ms.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author robert
 * @since 2018-01-22
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping(value = "getPage")
    public ResponseDto<Page<User>> getPage(@ModelAttribute UserQueryDto userQueryDto) {
        EntityWrapper<User> entityWrapper = new EntityWrapper<>();
        if (!StringUtils.isEmpty(userQueryDto.getUsername())) {
            entityWrapper.where("username={0}", userQueryDto.getUsername());
        }
        Page<User> userPage = new Page<>(userQueryDto.getPageNum(), userQueryDto.getPageSize());
        userPage = userService.selectPage(userPage, entityWrapper);
        return new ResponseDto<>(userPage);
    }

    @PostMapping(value = "add")
    public ResponseDto<Boolean> add(@RequestBody User user) {
        user.setCreateTime(new Date());
        boolean success = userService.insert(user);
        return new ResponseDto<>(success);
    }

    @GetMapping(value = "getById")
    public ResponseDto<User> getById(@RequestParam(value = "id") Integer id) {
        User user = userService.selectById(id);
        return new ResponseDto<>(user);
    }

    @PutMapping(value = "update")
    public ResponseDto<Boolean> update(@RequestBody User user) {
        boolean success = userService.updateById(user);
        return new ResponseDto<>(success);
    }

    @DeleteMapping(value = "delete")
    public ResponseDto<Boolean> delete(@RequestParam(value = "id") Integer id) {
        boolean success = userService.deleteById(id);
        return new ResponseDto<>(success);
    }
}
