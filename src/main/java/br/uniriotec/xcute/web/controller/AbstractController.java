package br.uniriotec.xcute.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import br.uniriotec.xcute.busines.service.IKipProcessService;

@Service
public class AbstractController {

	@Autowired
	private IKipProcessService kipProcessService;
	
	public String dispatchResponse(Model model, String path){
		model.addAttribute("processes", kipProcessService.findAll());
		return path;
	}

	public IKipProcessService getKipProcessService() {
		return kipProcessService;
	}

	public void setKipProcessService(IKipProcessService kipProcessService) {
		this.kipProcessService = kipProcessService;
	}
	
}
