package com.student.demo.service;

import com.student.demo.entity.Admin;
import java.util.List;

/**
 *
 * @author laoxue
 * @since 2023-06-07
 */

public interface IAdminService {

    public List<Admin> selectList();

    public Admin selectById(Admin admin);

    public int insert(Admin admin);

    public int updateById(Admin admin);

    public int deleteById(Admin admin);

    public int loginAdmin(Admin admin);

}
