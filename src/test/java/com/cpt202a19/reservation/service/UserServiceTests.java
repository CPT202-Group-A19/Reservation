package com.cpt202a19.reservation.service;

import com.cpt202a19.reservation.entity.User;
<<<<<<< HEAD
import com.cpt202a19.reservation.service.ex.ServiceException;

=======
import com.cpt202a19.reservation.mapper.UserMapper;
import com.cpt202a19.reservation.service.ex.ServiceException;
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

<<<<<<< HEAD
@RunWith(SpringRunner.class) // is a test launcher that can load Springboot test annotations
=======
// @RunWith(SpringRunner.class)注解是一个测试启动器，可以加载Springboot测试注解
@RunWith(SpringRunner.class)
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
@SpringBootTest
public class UserServiceTests {
    @Autowired
    private IUserService iuserService;

<<<<<<< HEAD
    // Test the encrypted registered new user and obtain the corresponding information
=======
    //测试加密过的注册新用户，并获取到对应信息
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    @Test
    public void reg(){
        try{
            User user = new User();
            user.setUsername("test01");
            user.setPassword("123456");
           iuserService.reg(user);
           System.out.println("OK");
        }catch (ServiceException e){
<<<<<<< HEAD
            // Get exception class name
            System.out.println(e.getClass().getSimpleName());
            // Get exception class information
            System.out.println(e.getMessage());
        }
    }

    // Login User Authentication Test
    @Test
    public void login() {
        User user = iuserService.login("test01", "123456");
        System.out.println(user);
    }

    // Test to get the user name
=======
            //获取异常类名称
            System.out.println(e.getClass().getSimpleName());
            //获取异常类信息
            System.out.println(e.getMessage());
        }
    }
         //登录用户验证测试
     @Test
     public void login() {
         User user = iuserService.login("test01", "123456");
         System.out.println(user);
     }
     //测试获取到用户名称
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    @Test
    public void getByUid() {
        try {
            Integer uid = 18;
            User user = iuserService.getByUid(uid);
            System.out.println(user);
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

<<<<<<< HEAD
    // Test modifying personal data
=======
    //测试修改个人资料
>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8
    @Test
    public void changeInfo() {
        try {
            Integer uid = 18;
            String username = "数据管理员";
            User user = new User();
            user.setPhone("15512328888");
            user.setEmail("admin03@cy.cn");
            user.setGender(2);
            iuserService.changeInfo(uid, username, user);
            System.out.println("OK");
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }
<<<<<<< HEAD

    // Test uploading user avatar pictures
    @Test
    public void changAvatar(){
        iuserService.changeAvatar(
                    8,"小明","/upload/test.png"
        );
    }
=======
        //测试上传用户头像图片
        @Test
        public void changAvatar(){
            iuserService.changeAvatar(
                    8,"小明","/upload/test.png"
            );
        }

>>>>>>> 01657420de04e445b55df4d61bcef89c175406e8

}
