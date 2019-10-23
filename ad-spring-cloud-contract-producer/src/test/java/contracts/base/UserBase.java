package contracts.base;

import com.ad.ServiceApp;
import com.ad.controller.UserController;
import com.ad.entities.User;
import com.ad.services.UserService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.BDDMockito.given;

/**
 * @Author AdrainHuang
 * @Date 2019/10/13 15:32
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ServiceApp.class)
public class UserBase {
	
	@Autowired
	private UserController userController;
	
	@MockBean
	private UserService userService;
	
	@Before
	public void setUp() throws Exception {
		User user = new User(1L, "adrain");
	
		given(userService.getUser(1L)).willReturn(user);
		RestAssuredMockMvc.standaloneSetup(this.userController);
	}
}