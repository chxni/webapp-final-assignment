package com.villager.controller;

import com.villager.model.dto.VillagerDTO;
import com.villager.model.service.VillagerService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/villager/list")
public class SelectAllVillagerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        VillagerService villagerService = new VillagerService();
        List<VillagerDTO> villagerList = villagerService.selectAllVillager();

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