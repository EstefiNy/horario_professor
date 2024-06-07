package com.meninas_gerentes.modelo;

public class Professor {
    private String nome;
    private String disciplina;
    private String agendaProfessor;


    public Professor(){

    }

    public Professor(String nome, String disciplina, String agendaProfessor) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.agendaProfessor = agendaProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getAgendaProfessor() {
        return agendaProfessor;
    }

    public void setAgendaProfessor(String agendaProfessor) {
        this.agendaProfessor = agendaProfessor;
    }

    @Override
    public String toString() {
        return "Professor [nome=" + nome + ", disciplina=" + disciplina + ", agendaProfessor=" + agendaProfessor + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((disciplina == null) ? 0 : disciplina.hashCode());
        result = prime * result + ((agendaProfessor == null) ? 0 : agendaProfessor.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Professor other = (Professor) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (disciplina == null) {
            if (other.disciplina != null)
                return false;
        } else if (!disciplina.equals(other.disciplina))
            return false;
        if (agendaProfessor == null) {
            if (other.agendaProfessor != null)
                return false;
        } else if (!agendaProfessor.equals(other.agendaProfessor))
            return false;
        return true;
    }

}