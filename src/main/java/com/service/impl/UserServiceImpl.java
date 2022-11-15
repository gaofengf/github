package com.service.impl;

import com.entity.Deposit;
import com.entity.UserBean;
import com.mapper.UserMapper;
import com.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public UserBean getlogin(UserBean user) {
        System.out.println(user);
        if(user!=null){
            if(!StringUtils.isEmpty(user.getCardid())){
                Example example=new Example(UserBean.class);
                Example.Criteria criteria = example.createCriteria();
                criteria.andEqualTo("cardid", user.getCardid());
                List<UserBean> list=userMapper.selectByExample(example);
                if(list!=null&&list.size()==1){
                    UserBean userBean=list.get(0);
                    if(userBean.getPassword().equals(user.getPassword())){
                        return userBean;
                    }
                }
            }
        }
        return null;
    }

    @Override
    public List<UserBean> findAll() {
        List<UserBean> list=userMapper.selectAll();
        for (UserBean userBean : list) {
            List<Deposit> dlist=userMapper.getDepositById(userBean.getId());
            userBean.setDlist(dlist);
            System.out.println(userBean.getDlist());
        }
        return list;
    }
}
