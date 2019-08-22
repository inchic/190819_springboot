// package com.example.springboot_190819.controller;

// import java.util.ArrayList;

// import java.util.List;
// import java.util.Map;

// import com.example.springboot_190819.repository.StudentRepository;


// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// // import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.ModelAndView;

// @Controller
// // @RequestMapping(value = "/student")
// public class StudentController {
//     @Autowired
//     private StudentRepository repository;

//     @RequestMapping(value = "/student/{action}", method = { RequestMethod.GET, RequestMethod.POST })

//     public ModelAndView actionMethod(@PathVariable String action, ModelAndView modelandView)
//     {
//         // String viewName = "/student/";
//         // List<Object> resultList = new ArrayList<Object>();
//         // if("list".equals(action)){
//         //     viewName += action;

//         //     resultList = (List) repository.findAll();
//         //     modelandView.setViewName(viewName);
//         //     modelandView.addObject("resultList", resultList);
//         // }

//         String viewName = "/student/"+action;
//         List<Object> resultList = new ArrayList<Object>();
//         resultList = (List) repository.findAll();
//         modelandView.setViewName(viewName);
//         modelandView.addObject("resultList", resultList);


//         return modelandView;
//     }
// }
