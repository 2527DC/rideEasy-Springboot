    package com.rideeasy.rideeasy.controller;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.RequestMapping;
    import org.springframework.web.bind.annotation.RestController;
    import com.rideeasy.rideeasy.services.UserService; 
    // import com.rideeasy.rideeasy.entity.User;
    @RestController  // Marks the class as a REST Controller
    @RequestMapping("/")  // Prefix to all the routes in this controllecler
    public class HelloController {



        @Autowired
        private UserService userService;


        // Map the root URL (GET request to "/")
        @GetMapping("/message")
        public String helloMan() {
            return "Hello, man!";
        }

        // Map the "/hello" URL (GET request to "/hello")
        @GetMapping("/hello")
        public String sayHello() {
            return "Hello, welcome to Rideeasy!";
        }

    

        @GetMapping("/users/{id}")
        public  String getUserById(@PathVariable Long id) {
            return  userService.getUserById(id);
        }
        
        // Another example with a dynamic path variable (GET request to "/greet/{name}")
        @GetMapping("/greet/{name}")
        public String greetUser(@PathVariable String name) {
            return "Hello, " + name + "!";
        }
    }
