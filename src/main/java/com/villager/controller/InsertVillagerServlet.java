package com.villager.controller;

import com.villager.model.dto.VillagerDTO;
import com.villager.model.service.VillagerService;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/villager/insert")
public class InsertVillagerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String villagerName = request.getParameter("villagerName");
        String gender = request.getParameter("gender");
        String birthDate = request.getParameter("birthDate");
        String species = request.getParameter("species");
        String personality = request.getParameter("personality");
        String catchphrase = request.getParameter("catchphrase");

        VillagerService villagerService = new VillagerService();

        VillagerDTO villager = new VillagerDTO();
        villager.setVillagerName(villagerName);
        villager.setGender(gender);
        villager.setBirthDate(birthDate);
        villager.setSpecies(species);
        villager.setPersonality(personality);
        villager.setCatchphrase(catchphrase);

        int result = villagerService.insertVillager(villager);

        String path = "";
        if(result > 0) {
            path = "/WEB-INF/views/common/successPage.jsp";
            request.setAttribute("successCode", "insertVillager");
        } else {
            path = "/WEB-INF/views/common/errorPage.jsp";
            request.setAttribute("message", "신규 주민 등록에 실패하셨습니다.");
        }

        request.getRequestDispatcher(path).forward(request, response);
    }


}