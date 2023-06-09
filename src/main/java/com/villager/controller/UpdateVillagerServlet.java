package com.villager.controller;

import com.villager.model.dto.VillagerDTO;
import com.villager.model.service.VillagerService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/villager/update")
public class UpdateVillagerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String villagerName = request.getParameter("villagerName");

        VillagerDTO villager = new VillagerDTO();
        villager.setVillagerName(villagerName);

        int result = new VillagerService().updateVillager(villager);

        String path = "";
        if(result > 0) {
            path = "/WEB-INF/views/common/successPage.jsp";
            request.setAttribute("successCode", "updateVillager");
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message", "주민 정보 수정 실패!");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }
}