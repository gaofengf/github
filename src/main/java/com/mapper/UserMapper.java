package com.mapper;

import com.entity.Deposit;
import com.entity.UserBean;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UserBean> {
    @Select("select d.* from t_deposit d\n" +
            "left join t_u_d r on r.did=d.d_id\n" +
            "where uid=#{id};")
    List<Deposit> getDepositById(Integer id);
}
