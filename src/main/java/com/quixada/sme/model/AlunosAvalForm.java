package com.quixada.sme.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class AlunosAvalForm {
	private ArrayList<Aluno> alunosList;

	public ArrayList<Aluno> getAlunosList() {
		return alunosList;
	}

	public void setAlunosList(ArrayList<Aluno> alunosList) {
		this.alunosList = alunosList;
	}

   
}
