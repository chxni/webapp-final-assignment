package com.villager.controller;

import com.villager.model.dto.VillagerDTO;
import com.villager.model.service.VillagerService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/villager/delete")
public class DeleteVillagerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String villagerName = request.getParameter("villagerName");

        VillagerService villagerService = new VillagerService();

        VillagerDTO villager = new VillagerDTO();
        villager.setVillagerName(villagerName);

        int result = villagerService.deleteVillager(villager);

        String path = "";
        if(result > 0) {
            path = "/WEB-INF/views/common/successPage.jsp";
            request.setAttribute("successCode", "deleteVillager");
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message", "주민 삭제 실패!");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }
}