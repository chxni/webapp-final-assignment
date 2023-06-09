package com.villager.controller;

import com.common.config.SearchCondition;
import com.villager.model.dto.VillagerDTO;
import com.villager.model.service.VillagerService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/villager/select")
public class SelectOneVillagerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String option = request.getParameter("condition");
        String value = null;
        if("species".equals(option)){
            value = request.getParameter("species");
        } else if ("personality".equals(option)){
            value = request.getParameter("personality");
        }


        SearchCondition searchCondition = new SearchCondition();
        searchCondition.setOption(option);
        searchCondition.setValue(value);

        System.out.println(searchCondition.getOption() + ", " + searchCondition.getValue());

        VillagerService villagerService = new VillagerService();
        List<VillagerDTO> villagerList = villagerService.selectVillagerByCondition(searchCondition);

        for(VillagerDTO villager : villagerList) {
            System.out.println(villager);
        }

        String path = "";

        if(villagerList != null) {
            path = "/WEB-INF/views/villagers/villagerList.jsp";
            request.setAttribute("villagerList", villagerList);
        } else {
            path = "/WEB-INF/views/commons/errorPage.jsp";
            request.setAttribute("message", "주민 목록 조회 실패!");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }
}